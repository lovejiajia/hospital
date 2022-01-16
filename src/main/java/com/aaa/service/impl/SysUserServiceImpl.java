package com.aaa.service.impl;

import com.aaa.dao.SysUserDao;
import com.aaa.entity.SysUser;
import com.aaa.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("SysUserService")
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserDao sysUserDao;
    @Override
    public List queueByIdForLogin(String loginName) {
        return sysUserDao.queueByIdForLogin(loginName);
    }

    @Override
    public int addSysUser(SysUser user) {
        return sysUserDao.addSysUser(user);
    }

    @Override
    public int deleteById(int id) {
        return sysUserDao.deleteById(id);
    }
}
