package com.aaa.service;

import com.aaa.entity.Pharmacy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Pharmacy)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public interface PharmacyService {

    /**
     * 通过ID查询单条数据
     *
     * @param pharmacyid 主键
     * @return 实例对象
     */
    Pharmacy queryById(Integer pharmacyid);

    /**
     * 分页查询
     *
     * @param pharmacy 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Pharmacy> queryByPage(Pharmacy pharmacy, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pharmacy 实例对象
     * @return 实例对象
     */
    Pharmacy insert(Pharmacy pharmacy);

    /**
     * 修改数据
     *
     * @param pharmacy 实例对象
     * @return 实例对象
     */
    Pharmacy update(Pharmacy pharmacy);

    /**
     * 通过主键删除数据
     *
     * @param pharmacyid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer pharmacyid);

}
