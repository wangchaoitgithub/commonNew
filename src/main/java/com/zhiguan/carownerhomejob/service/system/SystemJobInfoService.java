package com.zhiguan.carownerhomejob.service.system;

import com.zhiguan.carownerhomejob.domain.system.SystemJobInfo;

public interface SystemJobInfoService {
    SystemJobInfo selectByJobName(String jobName);

    boolean updateStatusWait(Long id);

    boolean updateStatusRun(Long id);
}
