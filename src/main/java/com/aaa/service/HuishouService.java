package com.aaa.service;

import com.aaa.entity.Huishou;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Huishou)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:10
 */
public interface HuishouService {

    /**
     * 通过ID查询单条数据
     *
     * @param huishouid 主键
     * @return 实例对象
     */
    Huishou queryById(Integer huishouid);

    /**
     * 分页查询
     *
     * @param huishou 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Huishou> queryByPage(Huishou huishou, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param huishou 实例对象
     * @return 实例对象
     */
    Huishou insert(Huishou huishou);

    /**
     * 修改数据
     *
     * @param huishou 实例对象
     * @return 实例对象
     */
    Huishou update(Huishou huishou);

    /**
     * 通过主键删除数据
     *
     * @param huishouid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer huishouid);

}
