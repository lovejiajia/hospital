package com.aaa.service;

import com.aaa.entity.Jilu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Jilu)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
public interface JiluService {

    /**
     * 通过ID查询单条数据
     *
     * @param jiluid 主键
     * @return 实例对象
     */
    Jilu queryById(Integer jiluid);

    /**
     * 分页查询
     *
     * @param jilu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Jilu> queryByPage(Jilu jilu, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param jilu 实例对象
     * @return 实例对象
     */
    Jilu insert(Jilu jilu);

    /**
     * 修改数据
     *
     * @param jilu 实例对象
     * @return 实例对象
     */
    Jilu update(Jilu jilu);

    /**
     * 通过主键删除数据
     *
     * @param jiluid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer jiluid);

}
