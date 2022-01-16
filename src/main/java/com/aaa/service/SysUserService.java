package com.aaa.service;

import com.aaa.entity.SysUser;

import java.util.List;

public interface SysUserService {
    List queueByIdForLogin(String loginName);
    int addSysUser(SysUser user);
    int deleteById(int id);
}
