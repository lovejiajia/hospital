package com.aaa.service;

import com.aaa.entity.SysUser;

public interface SysUserService {
    SysUser queueByIdForLogin(String loginName);
}
