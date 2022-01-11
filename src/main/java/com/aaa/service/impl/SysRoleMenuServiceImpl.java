package com.aaa.service.impl;

import com.aaa.entity.SysRoleMenu;
import com.aaa.dao.SysRoleMenuDao;
import com.aaa.service.SysRoleMenuService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (SysRoleMenu)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
@Service("sysRoleMenuService")
public class SysRoleMenuServiceImpl implements SysRoleMenuService {
    @Resource
    private SysRoleMenuDao sysRoleMenuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    @Override
    public SysRoleMenu queryById(Integer rid) {
        return this.sysRoleMenuDao.queryById(rid);
    }

    /**
     * 分页查询
     *
     * @param sysRoleMenu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SysRoleMenu> queryByPage(SysRoleMenu sysRoleMenu, PageRequest pageRequest) {
        long total = this.sysRoleMenuDao.count(sysRoleMenu);
        return new PageImpl<>(this.sysRoleMenuDao.queryAllByLimit(sysRoleMenu, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param sysRoleMenu 实例对象
     * @return 实例对象
     */
    @Override
    public SysRoleMenu insert(SysRoleMenu sysRoleMenu) {
        this.sysRoleMenuDao.insert(sysRoleMenu);
        return sysRoleMenu;
    }

    /**
     * 修改数据
     *
     * @param sysRoleMenu 实例对象
     * @return 实例对象
     */
    @Override
    public SysRoleMenu update(SysRoleMenu sysRoleMenu) {
        this.sysRoleMenuDao.update(sysRoleMenu);
        return this.queryById(sysRoleMenu.getRid());
    }

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer rid) {
        return this.sysRoleMenuDao.deleteById(rid) > 0;
    }
}
