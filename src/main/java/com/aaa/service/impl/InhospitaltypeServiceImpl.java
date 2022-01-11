package com.aaa.service.impl;

import com.aaa.dao.InhospitaltypeDao;
import com.aaa.entity.Inhospitaltype;
import com.aaa.service.InhospitaltypeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Inhospitaltype)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
@Service("inhospitaltypeService")
public class InhospitaltypeServiceImpl implements InhospitaltypeService {
    @Resource
    private InhospitaltypeDao inhospitaltypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param inhospitalid 主键
     * @return 实例对象
     */
    @Override
    public Inhospitaltype queryById(Integer inhospitalid) {
        return this.inhospitaltypeDao.queryById(inhospitalid);
    }

    /**
     * 分页查询
     *
     * @param inhospitaltype 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Inhospitaltype> queryByPage(Inhospitaltype inhospitaltype, PageRequest pageRequest) {
        long total = this.inhospitaltypeDao.count(inhospitaltype);
        return new PageImpl<>(this.inhospitaltypeDao.queryAllByLimit(inhospitaltype, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param inhospitaltype 实例对象
     * @return 实例对象
     */
    @Override
    public Inhospitaltype insert(Inhospitaltype inhospitaltype) {
        this.inhospitaltypeDao.insert(inhospitaltype);
        return inhospitaltype;
    }

    /**
     * 修改数据
     *
     * @param inhospitaltype 实例对象
     * @return 实例对象
     */
    @Override
    public Inhospitaltype update(Inhospitaltype inhospitaltype) {
        this.inhospitaltypeDao.update(inhospitaltype);
        return this.queryById(inhospitaltype.getInhospitalid());
    }

    /**
     * 通过主键删除数据
     *
     * @param inhospitalid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer inhospitalid) {
        return this.inhospitaltypeDao.deleteById(inhospitalid) > 0;
    }
}
