package com.aaa.service.impl;

import com.aaa.dao.SysUserDao;
import com.aaa.entity.SysUser;
import com.aaa.service.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (SysUser)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:13
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserDao sysUserDao;

    @Override
    public SysUser queryByname(String username) {
        return sysUserDao.queryByname(username);
    }
}
