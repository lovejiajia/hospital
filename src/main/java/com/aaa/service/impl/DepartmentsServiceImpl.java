package com.aaa.service.impl;

import com.aaa.dao.DepartmentsDao;
import com.aaa.entity.Departments;
import com.aaa.service.DepartmentsService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Departments)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
@Service("departmentsService")
public class DepartmentsServiceImpl implements DepartmentsService {
    @Resource
    private DepartmentsDao departmentsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param departmentid 主键
     * @return 实例对象
     */
    @Override
    public Departments queryById(Integer departmentid) {
        return this.departmentsDao.queryById(departmentid);
    }

    /**
     * 分页查询
     *
     * @param departments 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Departments> queryByPage(Departments departments, PageRequest pageRequest) {
        long total = this.departmentsDao.count(departments);
        return new PageImpl<>(this.departmentsDao.queryAllByLimit(departments, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param departments 实例对象
     * @return 实例对象
     */
    @Override
    public Departments insert(Departments departments) {
        this.departmentsDao.insert(departments);
        return departments;
    }

    /**
     * 修改数据
     *
     * @param departments 实例对象
     * @return 实例对象
     */
    @Override
    public Departments update(Departments departments) {
        this.departmentsDao.update(departments);
        return this.queryById(departments.getDepartmentid());
    }

    /**
     * 通过主键删除数据
     *
     * @param departmentid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer departmentid) {
        return this.departmentsDao.deleteById(departmentid) > 0;
    }
}
