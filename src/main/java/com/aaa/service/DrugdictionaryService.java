package com.aaa.service;

import com.aaa.entity.Drugdictionary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Drugdictionary)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public interface DrugdictionaryService {

    /**
     * 通过ID查询单条数据
     *
     * @param drugid 主键
     * @return 实例对象
     */
    Drugdictionary queryById(Integer drugid);

    /**
     * 分页查询
     *
     * @param drugdictionary 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Drugdictionary> queryByPage(Drugdictionary drugdictionary, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param drugdictionary 实例对象
     * @return 实例对象
     */
    Drugdictionary insert(Drugdictionary drugdictionary);

    /**
     * 修改数据
     *
     * @param drugdictionary 实例对象
     * @return 实例对象
     */
    Drugdictionary update(Drugdictionary drugdictionary);

    /**
     * 通过主键删除数据
     *
     * @param drugid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer drugid);

}
