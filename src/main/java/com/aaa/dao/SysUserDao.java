package com.aaa.dao;

import com.aaa.entity.SysUser;

import java.util.List;

/**
 * 系统人员登录表
 */
public interface SysUserDao {
    List queueByIdForLogin(String loginName);//系统管理
    int addSysUser(SysUser user);
    int deleteById(int id);
}
