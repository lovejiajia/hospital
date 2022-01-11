package com.aaa.service;

import com.aaa.entity.SysRoleUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (SysRoleUser)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:13
 */
public interface SysRoleUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    SysRoleUser queryById(Integer uid);

    /**
     * 分页查询
     *
     * @param sysRoleUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SysRoleUser> queryByPage(SysRoleUser sysRoleUser, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param sysRoleUser 实例对象
     * @return 实例对象
     */
    SysRoleUser insert(SysRoleUser sysRoleUser);

    /**
     * 修改数据
     *
     * @param sysRoleUser 实例对象
     * @return 实例对象
     */
    SysRoleUser update(SysRoleUser sysRoleUser);

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer uid);

}
