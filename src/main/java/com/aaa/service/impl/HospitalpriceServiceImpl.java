package com.aaa.service.impl;

import com.aaa.service.HospitalpriceService;
import com.aaa.dao.HospitalpriceDao;
import com.aaa.entity.Hospitalprice;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Hospitalprice)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:10
 */
@Service("hospitalpriceService")
public class HospitalpriceServiceImpl implements HospitalpriceService {
    @Resource
    private HospitalpriceDao hospitalpriceDao;

    /**
     * 通过ID查询单条数据
     *
     * @param hospitalpriceid 主键
     * @return 实例对象
     */
    @Override
    public Hospitalprice queryById(Integer hospitalpriceid) {
        return this.hospitalpriceDao.queryById(hospitalpriceid);
    }

    /**
     * 分页查询
     *
     * @param hospitalprice 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Hospitalprice> queryByPage(Hospitalprice hospitalprice, PageRequest pageRequest) {
        long total = this.hospitalpriceDao.count(hospitalprice);
        return new PageImpl<>(this.hospitalpriceDao.queryAllByLimit(hospitalprice, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param hospitalprice 实例对象
     * @return 实例对象
     */
    @Override
    public Hospitalprice insert(Hospitalprice hospitalprice) {
        this.hospitalpriceDao.insert(hospitalprice);
        return hospitalprice;
    }

    /**
     * 修改数据
     *
     * @param hospitalprice 实例对象
     * @return 实例对象
     */
    @Override
    public Hospitalprice update(Hospitalprice hospitalprice) {
        this.hospitalpriceDao.update(hospitalprice);
        return this.queryById(hospitalprice.getHospitalpriceid());
    }

    /**
     * 通过主键删除数据
     *
     * @param hospitalpriceid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer hospitalpriceid) {
        return this.hospitalpriceDao.deleteById(hospitalpriceid) > 0;
    }
}
