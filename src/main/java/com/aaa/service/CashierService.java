package com.aaa.service;

import com.aaa.entity.Cashier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Cashier)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public interface CashierService {

    /**
     * 通过ID查询单条数据
     *
     * @param cashier 主键
     * @return 实例对象
     */
    Cashier queryById(Integer cashier);

    /**
     * 分页查询
     *
     * @param cashier 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Cashier> queryByPage(Cashier cashier, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param cashier 实例对象
     * @return 实例对象
     */
    Cashier insert(Cashier cashier);

    /**
     * 修改数据
     *
     * @param cashier 实例对象
     * @return 实例对象
     */
    Cashier update(Cashier cashier);

    /**
     * 通过主键删除数据
     *
     * @param cashier 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cashier);

}
