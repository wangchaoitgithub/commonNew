package com.zhiguan.carownerhomejob.mapper.system;

import com.zhiguan.carownerhomejob.domain.system.SystemSetConfig;

public interface SystemSetConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SystemSetConfig record);

    int insertSelective(SystemSetConfig record);

    SystemSetConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemSetConfig record);

    int updateByPrimaryKey(SystemSetConfig record);


    SystemSetConfig selectParameterName();

    int updateToken(String token);
}