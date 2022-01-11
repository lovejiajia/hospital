package com.aaa.service.impl;

import com.aaa.dao.SysRoleDao;
import com.aaa.entity.SysRole;
import com.aaa.service.SysRoleService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (SysRole)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
@Service("sysRoleService")
public class SysRoleServiceImpl implements SysRoleService {
    @Resource
    private SysRoleDao sysRoleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param roleid 主键
     * @return 实例对象
     */
    @Override
    public SysRole queryById(Integer roleid) {
        return this.sysRoleDao.queryById(roleid);
    }

    /**
     * 分页查询
     *
     * @param sysRole 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SysRole> queryByPage(SysRole sysRole, PageRequest pageRequest) {
        long total = this.sysRoleDao.count(sysRole);
        return new PageImpl<>(this.sysRoleDao.queryAllByLimit(sysRole, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param sysRole 实例对象
     * @return 实例对象
     */
    @Override
    public SysRole insert(SysRole sysRole) {
        this.sysRoleDao.insert(sysRole);
        return sysRole;
    }

    /**
     * 修改数据
     *
     * @param sysRole 实例对象
     * @return 实例对象
     */
    @Override
    public SysRole update(SysRole sysRole) {
        this.sysRoleDao.update(sysRole);
        return this.queryById(sysRole.getRoleid());
    }

    /**
     * 通过主键删除数据
     *
     * @param roleid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer roleid) {
        return this.sysRoleDao.deleteById(roleid) > 0;
    }
}
