package com.aaa.service;

import com.aaa.entity.Skull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Skull)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public interface SkullService {

    /**
     * 通过ID查询单条数据
     *
     * @param skullid 主键
     * @return 实例对象
     */
    Skull queryById(Integer skullid);

    /**
     * 分页查询
     *
     * @param skull 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Skull> queryByPage(Skull skull, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param skull 实例对象
     * @return 实例对象
     */
    Skull insert(Skull skull);

    /**
     * 修改数据
     *
     * @param skull 实例对象
     * @return 实例对象
     */
    Skull update(Skull skull);

    /**
     * 通过主键删除数据
     *
     * @param skullid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer skullid);

}
