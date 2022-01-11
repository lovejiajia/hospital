package com.aaa.service.impl;

import com.aaa.dao.BedDao;
import com.aaa.entity.Bed;
import com.aaa.service.BedService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Bed)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
@Service("bedService")
public class BedServiceImpl implements BedService {
    @Resource
    private BedDao bedDao;

    /**
     * 通过ID查询单条数据
     *
     * @param bedid 主键
     * @return 实例对象
     */
    @Override
    public Bed queryById(Integer bedid) {
        return this.bedDao.queryById(bedid);
    }

    /**
     * 分页查询
     *
     * @param bed 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Bed> queryByPage(Bed bed, PageRequest pageRequest) {
        long total = this.bedDao.count(bed);
        return new PageImpl<>(this.bedDao.queryAllByLimit(bed, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param bed 实例对象
     * @return 实例对象
     */
    @Override
    public Bed insert(Bed bed) {
        this.bedDao.insert(bed);
        return bed;
    }

    /**
     * 修改数据
     *
     * @param bed 实例对象
     * @return 实例对象
     */
    @Override
    public Bed update(Bed bed) {
        this.bedDao.update(bed);
        return this.queryById(bed.getBedid());
    }

    /**
     * 通过主键删除数据
     *
     * @param bedid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer bedid) {
        return this.bedDao.deleteById(bedid) > 0;
    }
}
