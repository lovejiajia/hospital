package com.aaa.service.impl;

import com.aaa.entity.Upplier;
import com.aaa.dao.UpplierDao;
import com.aaa.service.UpplierService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Upplier)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:14
 */
@Service("upplierService")
public class UpplierServiceImpl implements UpplierService {
    @Resource
    private UpplierDao upplierDao;

    /**
     * 通过ID查询单条数据
     *
     * @param supplierid 主键
     * @return 实例对象
     */
    @Override
    public Upplier queryById(Integer supplierid) {
        return this.upplierDao.queryById(supplierid);
    }

    /**
     * 分页查询
     *
     * @param upplier 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Upplier> queryByPage(Upplier upplier, PageRequest pageRequest) {
        long total = this.upplierDao.count(upplier);
        return new PageImpl<>(this.upplierDao.queryAllByLimit(upplier, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param upplier 实例对象
     * @return 实例对象
     */
    @Override
    public Upplier insert(Upplier upplier) {
        this.upplierDao.insert(upplier);
        return upplier;
    }

    /**
     * 修改数据
     *
     * @param upplier 实例对象
     * @return 实例对象
     */
    @Override
    public Upplier update(Upplier upplier) {
        this.upplierDao.update(upplier);
        return this.queryById(upplier.getSupplierid());
    }

    /**
     * 通过主键删除数据
     *
     * @param supplierid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer supplierid) {
        return this.upplierDao.deleteById(supplierid) > 0;
    }
}
