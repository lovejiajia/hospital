package com.aaa.service;

import com.aaa.entity.Checkup;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Checkup)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public interface CheckupService {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    Checkup queryById(Integer cid);

    /**
     * 分页查询
     *
     * @param checkup 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Checkup> queryByPage(Checkup checkup, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param checkup 实例对象
     * @return 实例对象
     */
    Checkup insert(Checkup checkup);

    /**
     * 修改数据
     *
     * @param checkup 实例对象
     * @return 实例对象
     */
    Checkup update(Checkup checkup);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cid);

}
