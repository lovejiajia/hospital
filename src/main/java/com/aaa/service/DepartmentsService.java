package com.aaa.service;

import com.aaa.entity.Departments;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Departments)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public interface DepartmentsService {

    /**
     * 通过ID查询单条数据
     *
     * @param departmentid 主键
     * @return 实例对象
     */
    Departments queryById(Integer departmentid);

    /**
     * 分页查询
     *
     * @param departments 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Departments> queryByPage(Departments departments, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param departments 实例对象
     * @return 实例对象
     */
    Departments insert(Departments departments);

    /**
     * 修改数据
     *
     * @param departments 实例对象
     * @return 实例对象
     */
    Departments update(Departments departments);

    /**
     * 通过主键删除数据
     *
     * @param departmentid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer departmentid);

}
