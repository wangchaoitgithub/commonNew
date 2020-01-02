package com.zhiguan.carownerhomejob.job;


import javax.annotation.Resource;

import com.zhiguan.carownerhomejob.domain.system.SystemJobInfo;
import com.zhiguan.carownerhomejob.domain.system.SystemSetConfig;
import com.zhiguan.carownerhomejob.mapper.system.SystemSetConfigMapper;
import com.zhiguan.carownerhomejob.service.system.SystemJobInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.zhiguan.commonNew.biz.pojo.weixin.GetAccessTokenDto;
import com.zhiguan.commonNew.constant.CommonConstant;
import com.zhiguan.commonNew.util.StringUtil;
import com.zhiguan.commonNew.util.web.HttpExecuteUtil;
import com.zhiguan.commonNew.weixin.WeixinConfig;


/**
 * 参考：http://mp.weixin.qq.com/wiki/14/9f9c82c1af308e3b14ba9b973f99a8ba.html
 * @author wangchao
 * @createDate：2020-1-2
 */
public class AutoRefreshMiniAccessToken {
	
	public static final Logger log = LogManager.getLogger();
	
	@Resource
	SystemJobInfoService systemJobInfoService;
	@Resource
    SystemSetConfigMapper systemSetConfigMapper;
	private final String jobName = AutoRefreshMiniAccessToken.class.getSimpleName();
	/**
	 * 执行方法
	 * @remark 
	 * @author wangchao
	 * @createDate 2020-1-2
	 */
	public void execute() {
		
		long id = 0;
		SystemJobInfo systemJobInfo = systemJobInfoService.selectByJobName(jobName);

		if(systemJobInfo==null){
			log.warn(jobName +"job is not exist");
		}else{
			id = systemJobInfo.getId();
			//状态改成run，开始执行。只有处在wait被改成run状态才执行，避免自动任务频率短导致的重复插入。
			if (systemJobInfo.getStatus().equalsIgnoreCase(CommonConstant.Job_Status_Wait)) {
				try{
					systemJobInfoService.updateStatusRun(id);
					//做业务相关的事情
					deal();
				}catch(Exception e){
					log.error(e.getMessage());
				}finally{
					systemJobInfoService.updateStatusWait(id);
				}
			}else{
				log.warn("-----  "+jobName +" is running -----");
			}
		}
	
	}
	public void deal(){
		try {
			log.info("-----start deal "+jobName +"-----");
			SystemSetConfig systemSetConfig = systemSetConfigMapper.selectParameterName();
			String appidValue = systemSetConfig.getWeixinMiniAppId();
			String appSecretvalue = systemSetConfig.getWeixinMiniAppSecret();

			String resultJson = HttpExecuteUtil.getHttpGetConn(WeixinConfig.getWeixinAccessTokenUrl
					+ "?grant_type=client_credential"
					+ "&appid="+ appidValue
					+ "&secret="+ appSecretvalue);
				
				GetAccessTokenDto baseDto = JSON.parseObject(resultJson, GetAccessTokenDto.class);
				
				if(!StringUtil.isEmpty(baseDto.getAccess_token())){
					//获取成功的情况
					//先更新内存的Access_token
					String token = baseDto.getAccess_token();
					int count = systemSetConfigMapper.updateToken(token);
					if(count != 1){
						log.error("get weixin token error from weixin to db result is false");
					}
				}else{
					log.error("get weixin token error from weixin:"+resultJson);
				}

		} catch (Exception e) {
			log.error("get weixin token error:"+e.getMessage());
		}finally{
			log.info("-----end deal "+jobName +"-----");
		}
	}
}
