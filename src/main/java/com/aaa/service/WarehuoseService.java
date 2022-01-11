package com.aaa.service;

import com.aaa.entity.Warehuose;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Warehuose)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:14
 */
public interface WarehuoseService {

    /**
     * 通过ID查询单条数据
     *
     * @param warehouseid 主键
     * @return 实例对象
     */
    Warehuose queryById(Integer warehouseid);

    /**
     * 分页查询
     *
     * @param warehuose 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Warehuose> queryByPage(Warehuose warehuose, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param warehuose 实例对象
     * @return 实例对象
     */
    Warehuose insert(Warehuose warehuose);

    /**
     * 修改数据
     *
     * @param warehuose 实例对象
     * @return 实例对象
     */
    Warehuose update(Warehuose warehuose);

    /**
     * 通过主键删除数据
     *
     * @param warehouseid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer warehouseid);

}
