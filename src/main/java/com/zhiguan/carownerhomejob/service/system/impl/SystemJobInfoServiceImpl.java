package com.zhiguan.carownerhomejob.service.system.impl;

import com.zhiguan.carownerhomejob.domain.system.SystemJobInfo;
import com.zhiguan.carownerhomejob.mapper.system.SystemJobInfoMapper;
import com.zhiguan.carownerhomejob.service.system.SystemJobInfoService;
import com.zhiguan.commonNew.constant.CommonConstant;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;


@Transactional(rollbackFor = { Exception.class })
public class SystemJobInfoServiceImpl implements SystemJobInfoService {
	private static Logger logger = LogManager.getLogger("service");
	@Resource
	private SystemJobInfoMapper systemJobInfoMapper;

	@Override
	public SystemJobInfo selectByJobName(String jobName) {

		return systemJobInfoMapper.selectByJobName(jobName);
	}

	@Override
	public boolean updateStatusWait(Long id) {
		if (id == null || id == 0) {
			return false;
		} else {
			SystemJobInfo systemJobInfo = new SystemJobInfo();
			systemJobInfo.setId(id);
			systemJobInfo.setStatus(CommonConstant.Job_Status_Wait);
			systemJobInfo.setLastModifyTime(new Date());
			if (systemJobInfoMapper.updateByPrimaryKeySelective(systemJobInfo) == 1) {
				return true;
			} else {
				return false;
			}
		}
	}

	
	@Override
	public boolean updateStatusRun(Long id) {
		if (id == null || id == 0) {
			return false;
		} else {
			SystemJobInfo systemJobInfo = new SystemJobInfo();
			systemJobInfo.setId(id);
			systemJobInfo.setStatus(CommonConstant.Job_Status_Run);
			systemJobInfo.setLastModifyTime(new Date());
			if (systemJobInfoMapper.updateByPrimaryKeySelective(systemJobInfo) == 1) {
				return true;
			} else {
				return false;
			}
		}
	}
}
