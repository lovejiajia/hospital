package com.aaa.service;

import com.aaa.entity.Registeredtype;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Registeredtype)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public interface RegisteredtypeService {

    /**
     * 通过ID查询单条数据
     *
     * @param registeredid 主键
     * @return 实例对象
     */
    Registeredtype queryById(Integer registeredid);

    /**
     * 分页查询
     *
     * @param registeredtype 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Registeredtype> queryByPage(Registeredtype registeredtype, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param registeredtype 实例对象
     * @return 实例对象
     */
    Registeredtype insert(Registeredtype registeredtype);

    /**
     * 修改数据
     *
     * @param registeredtype 实例对象
     * @return 实例对象
     */
    Registeredtype update(Registeredtype registeredtype);

    /**
     * 通过主键删除数据
     *
     * @param registeredid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer registeredid);

}
