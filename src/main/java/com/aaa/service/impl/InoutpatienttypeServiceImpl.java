package com.aaa.service.impl;

import com.aaa.dao.InoutpatienttypeDao;
import com.aaa.entity.Inoutpatienttype;
import com.aaa.service.InoutpatienttypeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Inoutpatienttype)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
@Service("inoutpatienttypeService")
public class InoutpatienttypeServiceImpl implements InoutpatienttypeService {
    @Resource
    private InoutpatienttypeDao inoutpatienttypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param inoutpatientid 主键
     * @return 实例对象
     */
    @Override
    public Inoutpatienttype queryById(Integer inoutpatientid) {
        return this.inoutpatienttypeDao.queryById(inoutpatientid);
    }

    /**
     * 分页查询
     *
     * @param inoutpatienttype 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Inoutpatienttype> queryByPage(Inoutpatienttype inoutpatienttype, PageRequest pageRequest) {
        long total = this.inoutpatienttypeDao.count(inoutpatienttype);
        return new PageImpl<>(this.inoutpatienttypeDao.queryAllByLimit(inoutpatienttype, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param inoutpatienttype 实例对象
     * @return 实例对象
     */
    @Override
    public Inoutpatienttype insert(Inoutpatienttype inoutpatienttype) {
        this.inoutpatienttypeDao.insert(inoutpatienttype);
        return inoutpatienttype;
    }

    /**
     * 修改数据
     *
     * @param inoutpatienttype 实例对象
     * @return 实例对象
     */
    @Override
    public Inoutpatienttype update(Inoutpatienttype inoutpatienttype) {
        this.inoutpatienttypeDao.update(inoutpatienttype);
        return this.queryById(inoutpatienttype.getInoutpatientid());
    }

    /**
     * 通过主键删除数据
     *
     * @param inoutpatientid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer inoutpatientid) {
        return this.inoutpatienttypeDao.deleteById(inoutpatientid) > 0;
    }
}
