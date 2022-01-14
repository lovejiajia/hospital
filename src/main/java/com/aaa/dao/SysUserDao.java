package com.aaa.dao;

import com.aaa.entity.SysUser;

/**
 * 系统人员登录表
 */
public interface SysUserDao {
    SysUser queueByIdForLogin(String loginName);//系统管理
    int addSysUser(SysUser user);
}
