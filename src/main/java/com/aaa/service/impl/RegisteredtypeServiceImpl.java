package com.aaa.service.impl;

import com.aaa.dao.RegisteredtypeDao;
import com.aaa.entity.Registeredtype;
import com.aaa.service.RegisteredtypeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Registeredtype)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
@Service("registeredtypeService")
public class RegisteredtypeServiceImpl implements RegisteredtypeService {
    @Resource
    private RegisteredtypeDao registeredtypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param registeredid 主键
     * @return 实例对象
     */
    @Override
    public Registeredtype queryById(Integer registeredid) {
        return this.registeredtypeDao.queryById(registeredid);
    }

    /**
     * 分页查询
     *
     * @param registeredtype 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Registeredtype> queryByPage(Registeredtype registeredtype, PageRequest pageRequest) {
        long total = this.registeredtypeDao.count(registeredtype);
        return new PageImpl<>(this.registeredtypeDao.queryAllByLimit(registeredtype, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param registeredtype 实例对象
     * @return 实例对象
     */
    @Override
    public Registeredtype insert(Registeredtype registeredtype) {
        this.registeredtypeDao.insert(registeredtype);
        return registeredtype;
    }

    /**
     * 修改数据
     *
     * @param registeredtype 实例对象
     * @return 实例对象
     */
    @Override
    public Registeredtype update(Registeredtype registeredtype) {
        this.registeredtypeDao.update(registeredtype);
        return this.queryById(registeredtype.getRegisteredid());
    }

    /**
     * 通过主键删除数据
     *
     * @param registeredid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer registeredid) {
        return this.registeredtypeDao.deleteById(registeredid) > 0;
    }
}
