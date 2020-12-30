package com.health.community.service;

import com.health.community.domain.LoginLog;

public interface LoginLogService {


    /**
     * 插入一条登录日志
     */
    boolean addLog(LoginLog log);
}
