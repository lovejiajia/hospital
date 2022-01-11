package com.aaa.service;

import com.aaa.entity.Pay;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Pay)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
public interface PayService {

    /**
     * 通过ID查询单条数据
     *
     * @param payid 主键
     * @return 实例对象
     */
    Pay queryById(Integer payid);

    /**
     * 分页查询
     *
     * @param pay 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Pay> queryByPage(Pay pay, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param pay 实例对象
     * @return 实例对象
     */
    Pay insert(Pay pay);

    /**
     * 修改数据
     *
     * @param pay 实例对象
     * @return 实例对象
     */
    Pay update(Pay pay);

    /**
     * 通过主键删除数据
     *
     * @param payid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer payid);

}
