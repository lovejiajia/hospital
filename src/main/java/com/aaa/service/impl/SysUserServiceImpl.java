package com.aaa.service.impl;

import com.aaa.dao.SysUserDao;
import com.aaa.entity.SysUser;
import com.aaa.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("SysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserDao sysUserDao;
    @Override
    public SysUser queueByIdForLogin(String loginName) {
        return sysUserDao.queueByIdForLogin(loginName);
    }
}
