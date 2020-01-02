package com.zhiguan.carownerhomejob.mapper.system;

import com.zhiguan.carownerhomejob.domain.system.SystemJobInfo;

public interface SystemJobInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemJobInfo record);

    int insertSelective(SystemJobInfo record);

    SystemJobInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemJobInfo record);

    int updateByPrimaryKey(SystemJobInfo record);


    public SystemJobInfo selectByJobName(String jobName);


}