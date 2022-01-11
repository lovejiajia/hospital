package com.aaa.service.impl;

import com.aaa.dao.WarehuoseDao;
import com.aaa.entity.Warehuose;
import com.aaa.service.WarehuoseService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Warehuose)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:14
 */
@Service("warehuoseService")
public class WarehuoseServiceImpl implements WarehuoseService {
    @Resource
    private WarehuoseDao warehuoseDao;

    /**
     * 通过ID查询单条数据
     *
     * @param warehouseid 主键
     * @return 实例对象
     */
    @Override
    public Warehuose queryById(Integer warehouseid) {
        return this.warehuoseDao.queryById(warehouseid);
    }

    /**
     * 分页查询
     *
     * @param warehuose 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Warehuose> queryByPage(Warehuose warehuose, PageRequest pageRequest) {
        long total = this.warehuoseDao.count(warehuose);
        return new PageImpl<>(this.warehuoseDao.queryAllByLimit(warehuose, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param warehuose 实例对象
     * @return 实例对象
     */
    @Override
    public Warehuose insert(Warehuose warehuose) {
        this.warehuoseDao.insert(warehuose);
        return warehuose;
    }

    /**
     * 修改数据
     *
     * @param warehuose 实例对象
     * @return 实例对象
     */
    @Override
    public Warehuose update(Warehuose warehuose) {
        this.warehuoseDao.update(warehuose);
        return this.queryById(warehuose.getWarehouseid());
    }

    /**
     * 通过主键删除数据
     *
     * @param warehouseid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer warehouseid) {
        return this.warehuoseDao.deleteById(warehouseid) > 0;
    }
}
