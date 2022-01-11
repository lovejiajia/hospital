package com.aaa.service.impl;

import com.aaa.dao.OutpatienttypeDao;
import com.aaa.entity.Outpatienttype;
import com.aaa.service.OutpatienttypeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Outpatienttype)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
@Service("outpatienttypeService")
public class OutpatienttypeServiceImpl implements OutpatienttypeService {
    @Resource
    private OutpatienttypeDao outpatienttypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param outpatientid 主键
     * @return 实例对象
     */
    @Override
    public Outpatienttype queryById(Integer outpatientid) {
        return this.outpatienttypeDao.queryById(outpatientid);
    }

    /**
     * 分页查询
     *
     * @param outpatienttype 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Outpatienttype> queryByPage(Outpatienttype outpatienttype, PageRequest pageRequest) {
        long total = this.outpatienttypeDao.count(outpatienttype);
        return new PageImpl<>(this.outpatienttypeDao.queryAllByLimit(outpatienttype, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param outpatienttype 实例对象
     * @return 实例对象
     */
    @Override
    public Outpatienttype insert(Outpatienttype outpatienttype) {
        this.outpatienttypeDao.insert(outpatienttype);
        return outpatienttype;
    }

    /**
     * 修改数据
     *
     * @param outpatienttype 实例对象
     * @return 实例对象
     */
    @Override
    public Outpatienttype update(Outpatienttype outpatienttype) {
        this.outpatienttypeDao.update(outpatienttype);
        return this.queryById(outpatienttype.getOutpatientid());
    }

    /**
     * 通过主键删除数据
     *
     * @param outpatientid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer outpatientid) {
        return this.outpatienttypeDao.deleteById(outpatientid) > 0;
    }
}
