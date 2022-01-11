package com.aaa.service;

import com.aaa.entity.Unit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Unit)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:14
 */
public interface UnitService {

    /**
     * 通过ID查询单条数据
     *
     * @param unitid 主键
     * @return 实例对象
     */
    Unit queryById(Integer unitid);

    /**
     * 分页查询
     *
     * @param unit 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Unit> queryByPage(Unit unit, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param unit 实例对象
     * @return 实例对象
     */
    Unit insert(Unit unit);

    /**
     * 修改数据
     *
     * @param unit 实例对象
     * @return 实例对象
     */
    Unit update(Unit unit);

    /**
     * 通过主键删除数据
     *
     * @param unitid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer unitid);

}
