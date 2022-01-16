package com.aaa.controller;

import com.aaa.entity.SysUser;
import com.aaa.service.SysUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * 系统管理员
 */
@RequestMapping("sys")
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    @RequestMapping("addUser")
    public int addUser(SysUser user){
        return sysUserService.addSysUser(user);
    }

    @RequestMapping("delUser")
    public int delUser(int id){
        return sysUserService.deleteById(id);
    }

    @RequestMapping("selUser")
    public PageInfo selUser(String name, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<SysUser> list = sysUserService.queueByIdForLogin(name);
        PageInfo info = new PageInfo(list);
        return info;
    }
}
