package com.aaa.service.impl;

import com.aaa.dao.ProjecttypeDao;
import com.aaa.entity.Projecttype;
import com.aaa.service.ProjecttypeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Projecttype)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
@Service("projecttypeService")
public class ProjecttypeServiceImpl implements ProjecttypeService {
    @Resource
    private ProjecttypeDao projecttypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param projectid 主键
     * @return 实例对象
     */
    @Override
    public Projecttype queryById(Integer projectid) {
        return this.projecttypeDao.queryById(projectid);
    }

    /**
     * 分页查询
     *
     * @param projecttype 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Projecttype> queryByPage(Projecttype projecttype, PageRequest pageRequest) {
        long total = this.projecttypeDao.count(projecttype);
        return new PageImpl<>(this.projecttypeDao.queryAllByLimit(projecttype, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param projecttype 实例对象
     * @return 实例对象
     */
    @Override
    public Projecttype insert(Projecttype projecttype) {
        this.projecttypeDao.insert(projecttype);
        return projecttype;
    }

    /**
     * 修改数据
     *
     * @param projecttype 实例对象
     * @return 实例对象
     */
    @Override
    public Projecttype update(Projecttype projecttype) {
        this.projecttypeDao.update(projecttype);
        return this.queryById(projecttype.getProjectid());
    }

    /**
     * 通过主键删除数据
     *
     * @param projectid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer projectid) {
        return this.projecttypeDao.deleteById(projectid) > 0;
    }
}
