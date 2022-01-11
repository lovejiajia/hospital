package com.aaa.service.impl;

import com.aaa.dao.MoneytypeDao;
import com.aaa.entity.Moneytype;
import com.aaa.service.MoneytypeService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Moneytype)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
@Service("moneytypeService")
public class MoneytypeServiceImpl implements MoneytypeService {
    @Resource
    private MoneytypeDao moneytypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param moneyid 主键
     * @return 实例对象
     */
    @Override
    public Moneytype queryById(Integer moneyid) {
        return this.moneytypeDao.queryById(moneyid);
    }

    /**
     * 分页查询
     *
     * @param moneytype 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Moneytype> queryByPage(Moneytype moneytype, PageRequest pageRequest) {
        long total = this.moneytypeDao.count(moneytype);
        return new PageImpl<>(this.moneytypeDao.queryAllByLimit(moneytype, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param moneytype 实例对象
     * @return 实例对象
     */
    @Override
    public Moneytype insert(Moneytype moneytype) {
        this.moneytypeDao.insert(moneytype);
        return moneytype;
    }

    /**
     * 修改数据
     *
     * @param moneytype 实例对象
     * @return 实例对象
     */
    @Override
    public Moneytype update(Moneytype moneytype) {
        this.moneytypeDao.update(moneytype);
        return this.queryById(moneytype.getMoneyid());
    }

    /**
     * 通过主键删除数据
     *
     * @param moneyid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer moneyid) {
        return this.moneytypeDao.deleteById(moneyid) > 0;
    }
}
