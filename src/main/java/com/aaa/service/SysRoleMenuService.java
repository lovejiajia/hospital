package com.aaa.service;

import com.aaa.entity.SysRoleMenu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (SysRoleMenu)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public interface SysRoleMenuService {

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    SysRoleMenu queryById(Integer rid);

    /**
     * 分页查询
     *
     * @param sysRoleMenu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SysRoleMenu> queryByPage(SysRoleMenu sysRoleMenu, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param sysRoleMenu 实例对象
     * @return 实例对象
     */
    SysRoleMenu insert(SysRoleMenu sysRoleMenu);

    /**
     * 修改数据
     *
     * @param sysRoleMenu 实例对象
     * @return 实例对象
     */
    SysRoleMenu update(SysRoleMenu sysRoleMenu);

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rid);

}
