package com.aaa.service.impl;

import com.aaa.dao.PayDao;
import com.aaa.dao.RegisterDao;
import com.aaa.entity.Pay;
import com.aaa.entity.Register;
import com.aaa.service.PayService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("payService")
public class PayServiceImpl implements PayService {

    @Resource
    private PayDao payDao;
    @Resource
    private RegisterDao registerDao;

    /**
     * 用户缴费，pay表及用户余额表改变
     * 开启事务
     * @param pay
     * @return
     */
    @Transactional
    @Override
    public int add(Pay pay) {
        registerDao.addMoney(pay.getPayid(), pay.getMoney());
        return payDao.add(pay);
    }

    @Override
    public List<Pay> select(int id) {
        return payDao.select(id);
    }
}
