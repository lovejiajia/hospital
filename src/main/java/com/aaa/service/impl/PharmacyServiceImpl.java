package com.aaa.service.impl;

import com.aaa.entity.Pharmacy;
import com.aaa.dao.PharmacyDao;
import com.aaa.service.PharmacyService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Pharmacy)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
@Service("pharmacyService")
public class PharmacyServiceImpl implements PharmacyService {
    @Resource
    private PharmacyDao pharmacyDao;

    /**
     * 通过ID查询单条数据
     *
     * @param pharmacyid 主键
     * @return 实例对象
     */
    @Override
    public Pharmacy queryById(Integer pharmacyid) {
        return this.pharmacyDao.queryById(pharmacyid);
    }

    /**
     * 分页查询
     *
     * @param pharmacy 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Pharmacy> queryByPage(Pharmacy pharmacy, PageRequest pageRequest) {
        long total = this.pharmacyDao.count(pharmacy);
        return new PageImpl<>(this.pharmacyDao.queryAllByLimit(pharmacy, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pharmacy 实例对象
     * @return 实例对象
     */
    @Override
    public Pharmacy insert(Pharmacy pharmacy) {
        this.pharmacyDao.insert(pharmacy);
        return pharmacy;
    }

    /**
     * 修改数据
     *
     * @param pharmacy 实例对象
     * @return 实例对象
     */
    @Override
    public Pharmacy update(Pharmacy pharmacy) {
        this.pharmacyDao.update(pharmacy);
        return this.queryById(pharmacy.getPharmacyid());
    }

    /**
     * 通过主键删除数据
     *
     * @param pharmacyid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer pharmacyid) {
        return this.pharmacyDao.deleteById(pharmacyid) > 0;
    }
}
