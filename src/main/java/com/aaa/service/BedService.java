package com.aaa.service;

import com.aaa.entity.Bed;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Bed)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public interface BedService {

    /**
     * 通过ID查询单条数据
     *
     * @param bedid 主键
     * @return 实例对象
     */
    Bed queryById(Integer bedid);

    /**
     * 分页查询
     *
     * @param bed 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Bed> queryByPage(Bed bed, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param bed 实例对象
     * @return 实例对象
     */
    Bed insert(Bed bed);

    /**
     * 修改数据
     *
     * @param bed 实例对象
     * @return 实例对象
     */
    Bed update(Bed bed);

    /**
     * 通过主键删除数据
     *
     * @param bedid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer bedid);

}
