package com.aaa.service.impl;

import com.aaa.dao.SysMenuDao;
import com.aaa.service.SysMenuService;
import com.aaa.entity.SysMenu;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (SysMenu)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
@Service("sysMenuService")
public class SysMenuServiceImpl implements SysMenuService {
    @Resource
    private SysMenuDao sysMenuDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysMenu queryById(Integer id) {
        return this.sysMenuDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param sysMenu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SysMenu> queryByPage(SysMenu sysMenu, PageRequest pageRequest) {
        long total = this.sysMenuDao.count(sysMenu);
        return new PageImpl<>(this.sysMenuDao.queryAllByLimit(sysMenu, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param sysMenu 实例对象
     * @return 实例对象
     */
    @Override
    public SysMenu insert(SysMenu sysMenu) {
        this.sysMenuDao.insert(sysMenu);
        return sysMenu;
    }

    /**
     * 修改数据
     *
     * @param sysMenu 实例对象
     * @return 实例对象
     */
    @Override
    public SysMenu update(SysMenu sysMenu) {
        this.sysMenuDao.update(sysMenu);
        return this.queryById(sysMenu.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysMenuDao.deleteById(id) > 0;
    }
}
