package com.aaa.service;

import com.aaa.entity.Caigou;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Caigou)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public interface CaigouService {

    /**
     * 通过ID查询单条数据
     *
     * @param caigouid 主键
     * @return 实例对象
     */
    Caigou queryById(Integer caigouid);

    /**
     * 分页查询
     *
     * @param caigou 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Caigou> queryByPage(Caigou caigou, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param caigou 实例对象
     * @return 实例对象
     */
    Caigou insert(Caigou caigou);

    /**
     * 修改数据
     *
     * @param caigou 实例对象
     * @return 实例对象
     */
    Caigou update(Caigou caigou);

    /**
     * 通过主键删除数据
     *
     * @param caigouid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer caigouid);

}
