package com.aaa.service;

import com.aaa.entity.Upplier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Upplier)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:14
 */
public interface UpplierService {

    /**
     * 通过ID查询单条数据
     *
     * @param supplierid 主键
     * @return 实例对象
     */
    Upplier queryById(Integer supplierid);

    /**
     * 分页查询
     *
     * @param upplier 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Upplier> queryByPage(Upplier upplier, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param upplier 实例对象
     * @return 实例对象
     */
    Upplier insert(Upplier upplier);

    /**
     * 修改数据
     *
     * @param upplier 实例对象
     * @return 实例对象
     */
    Upplier update(Upplier upplier);

    /**
     * 通过主键删除数据
     *
     * @param supplierid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer supplierid);

}
