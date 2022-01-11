package com.aaa.service.impl;

import com.aaa.dao.JiluDao;
import com.aaa.entity.Jilu;
import com.aaa.service.JiluService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Jilu)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
@Service("jiluService")
public class JiluServiceImpl implements JiluService {
    @Resource
    private JiluDao jiluDao;

    /**
     * 通过ID查询单条数据
     *
     * @param jiluid 主键
     * @return 实例对象
     */
    @Override
    public Jilu queryById(Integer jiluid) {
        return this.jiluDao.queryById(jiluid);
    }

    /**
     * 分页查询
     *
     * @param jilu 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Jilu> queryByPage(Jilu jilu, PageRequest pageRequest) {
        long total = this.jiluDao.count(jilu);
        return new PageImpl<>(this.jiluDao.queryAllByLimit(jilu, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param jilu 实例对象
     * @return 实例对象
     */
    @Override
    public Jilu insert(Jilu jilu) {
        this.jiluDao.insert(jilu);
        return jilu;
    }

    /**
     * 修改数据
     *
     * @param jilu 实例对象
     * @return 实例对象
     */
    @Override
    public Jilu update(Jilu jilu) {
        this.jiluDao.update(jilu);
        return this.queryById(jilu.getJiluid());
    }

    /**
     * 通过主键删除数据
     *
     * @param jiluid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer jiluid) {
        return this.jiluDao.deleteById(jiluid) > 0;
    }
}
