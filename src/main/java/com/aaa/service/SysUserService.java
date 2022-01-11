package com.aaa.service;

import com.aaa.entity.SysUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (SysUser)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:13
 */
public interface SysUserService {

    SysUser queryByname(String username);
}
