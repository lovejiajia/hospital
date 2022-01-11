package com.aaa.service.impl;

import com.aaa.entity.Pay;
import com.aaa.dao.PayDao;
import com.aaa.service.PayService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Pay)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
@Service("payService")
public class PayServiceImpl implements PayService {
    @Resource
    private PayDao payDao;

    /**
     * 通过ID查询单条数据
     *
     * @param payid 主键
     * @return 实例对象
     */
    @Override
    public Pay queryById(Integer payid) {
        return this.payDao.queryById(payid);
    }

    /**
     * 分页查询
     *
     * @param pay 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Pay> queryByPage(Pay pay, PageRequest pageRequest) {
        long total = this.payDao.count(pay);
        return new PageImpl<>(this.payDao.queryAllByLimit(pay, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param pay 实例对象
     * @return 实例对象
     */
    @Override
    public Pay insert(Pay pay) {
        this.payDao.insert(pay);
        return pay;
    }

    /**
     * 修改数据
     *
     * @param pay 实例对象
     * @return 实例对象
     */
    @Override
    public Pay update(Pay pay) {
        this.payDao.update(pay);
        return this.queryById(pay.getPayid());
    }

    /**
     * 通过主键删除数据
     *
     * @param payid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer payid) {
        return this.payDao.deleteById(payid) > 0;
    }
}
