package com.aaa.service.impl;

import com.aaa.dao.UnitDao;
import com.aaa.entity.Unit;
import com.aaa.service.UnitService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Unit)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:14
 */
@Service("unitService")
public class UnitServiceImpl implements UnitService {
    @Resource
    private UnitDao unitDao;

    /**
     * 通过ID查询单条数据
     *
     * @param unitid 主键
     * @return 实例对象
     */
    @Override
    public Unit queryById(Integer unitid) {
        return this.unitDao.queryById(unitid);
    }

    /**
     * 分页查询
     *
     * @param unit 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Unit> queryByPage(Unit unit, PageRequest pageRequest) {
        long total = this.unitDao.count(unit);
        return new PageImpl<>(this.unitDao.queryAllByLimit(unit, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param unit 实例对象
     * @return 实例对象
     */
    @Override
    public Unit insert(Unit unit) {
        this.unitDao.insert(unit);
        return unit;
    }

    /**
     * 修改数据
     *
     * @param unit 实例对象
     * @return 实例对象
     */
    @Override
    public Unit update(Unit unit) {
        this.unitDao.update(unit);
        return this.queryById(unit.getUnitid());
    }

    /**
     * 通过主键删除数据
     *
     * @param unitid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer unitid) {
        return this.unitDao.deleteById(unitid) > 0;
    }
}
