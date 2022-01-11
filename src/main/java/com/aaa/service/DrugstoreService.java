package com.aaa.service;

import com.aaa.entity.Drugstore;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Drugstore)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:10
 */
public interface DrugstoreService {

    /**
     * 通过ID查询单条数据
     *
     * @param rugstoreid 主键
     * @return 实例对象
     */
    Drugstore queryById(Integer rugstoreid);

    /**
     * 分页查询
     *
     * @param drugstore 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Drugstore> queryByPage(Drugstore drugstore, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param drugstore 实例对象
     * @return 实例对象
     */
    Drugstore insert(Drugstore drugstore);

    /**
     * 修改数据
     *
     * @param drugstore 实例对象
     * @return 实例对象
     */
    Drugstore update(Drugstore drugstore);

    /**
     * 通过主键删除数据
     *
     * @param rugstoreid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer rugstoreid);

}
