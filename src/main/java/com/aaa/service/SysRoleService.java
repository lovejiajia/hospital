package com.aaa.service;

import com.aaa.entity.SysRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (SysRole)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public interface SysRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param roleid 主键
     * @return 实例对象
     */
    SysRole queryById(Integer roleid);

    /**
     * 分页查询
     *
     * @param sysRole 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<SysRole> queryByPage(SysRole sysRole, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param sysRole 实例对象
     * @return 实例对象
     */
    SysRole insert(SysRole sysRole);

    /**
     * 修改数据
     *
     * @param sysRole 实例对象
     * @return 实例对象
     */
    SysRole update(SysRole sysRole);

    /**
     * 通过主键删除数据
     *
     * @param roleid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer roleid);

}
