package com.aaa.service;

import com.aaa.entity.Hospitalprice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Hospitalprice)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:10
 */
public interface HospitalpriceService {

    /**
     * 通过ID查询单条数据
     *
     * @param hospitalpriceid 主键
     * @return 实例对象
     */
    Hospitalprice queryById(Integer hospitalpriceid);

    /**
     * 分页查询
     *
     * @param hospitalprice 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Hospitalprice> queryByPage(Hospitalprice hospitalprice, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param hospitalprice 实例对象
     * @return 实例对象
     */
    Hospitalprice insert(Hospitalprice hospitalprice);

    /**
     * 修改数据
     *
     * @param hospitalprice 实例对象
     * @return 实例对象
     */
    Hospitalprice update(Hospitalprice hospitalprice);

    /**
     * 通过主键删除数据
     *
     * @param hospitalpriceid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer hospitalpriceid);

}
