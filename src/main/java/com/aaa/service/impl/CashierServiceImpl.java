package com.aaa.service.impl;

import com.aaa.dao.CashierDao;
import com.aaa.entity.Cashier;
import com.aaa.service.CashierService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Cashier)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
@Service("cashierService")
public class CashierServiceImpl implements CashierService {
    @Resource
    private CashierDao cashierDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cashier 主键
     * @return 实例对象
     */
    @Override
    public Cashier queryById(Integer cashier) {
        return this.cashierDao.queryById(cashier);
    }

    /**
     * 分页查询
     *
     * @param cashier 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Cashier> queryByPage(Cashier cashier, PageRequest pageRequest) {
        long total = this.cashierDao.count(cashier);
        return new PageImpl<>(this.cashierDao.queryAllByLimit(cashier, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param cashier 实例对象
     * @return 实例对象
     */
    @Override
    public Cashier insert(Cashier cashier) {
        this.cashierDao.insert(cashier);
        return cashier;
    }

    /**
     * 修改数据
     *
     * @param cashier 实例对象
     * @return 实例对象
     */
    @Override
    public Cashier update(Cashier cashier) {
        this.cashierDao.update(cashier);
        return this.queryById(cashier.getCashier());
    }

    /**
     * 通过主键删除数据
     *
     * @param cashier 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cashier) {
        return this.cashierDao.deleteById(cashier) > 0;
    }
}
