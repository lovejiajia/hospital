package com.aaa.service.impl;

import com.aaa.dao.SysRoleUserDao;
import com.aaa.entity.SysRoleUser;
import com.aaa.service.SysRoleUserService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (SysRoleUser)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:13
 */
@Service("sysRoleUserService")
public class SysRoleUserServiceImpl implements SysRoleUserService {
    @Resource
    private SysRoleUserDao sysRoleUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param uid 主键
     * @return 实例对象
     */
    @Override
    public SysRoleUser queryById(Integer uid) {
        return this.sysRoleUserDao.queryById(uid);
    }

    /**
     * 分页查询
     *
     * @param sysRoleUser 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<SysRoleUser> queryByPage(SysRoleUser sysRoleUser, PageRequest pageRequest) {
        long total = this.sysRoleUserDao.count(sysRoleUser);
        return new PageImpl<>(this.sysRoleUserDao.queryAllByLimit(sysRoleUser, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param sysRoleUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysRoleUser insert(SysRoleUser sysRoleUser) {
        this.sysRoleUserDao.insert(sysRoleUser);
        return sysRoleUser;
    }

    /**
     * 修改数据
     *
     * @param sysRoleUser 实例对象
     * @return 实例对象
     */
    @Override
    public SysRoleUser update(SysRoleUser sysRoleUser) {
        this.sysRoleUserDao.update(sysRoleUser);
        return this.queryById(sysRoleUser.getUid());
    }

    /**
     * 通过主键删除数据
     *
     * @param uid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer uid) {
        return this.sysRoleUserDao.deleteById(uid) > 0;
    }
}
