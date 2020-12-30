package com.health.community.service.impl;

import com.health.community.dao.LoginLogMapper;
import com.health.community.domain.LoginLog;
import com.health.community.service.LoginLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginLogServiceImpl implements LoginLogService {

    @Autowired
    public LoginLogMapper loginLogDao;

    public boolean addLog(LoginLog log) {

        if(loginLogDao.insert(log)>0){
            return true;
        }else {
            return false;
        }
    }
}
