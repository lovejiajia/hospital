package com.aaa.service.impl;

import com.aaa.dao.HospitapriceDao;
import com.aaa.dao.RegisterDao;
import com.aaa.entity.Hospitalprice;
import com.aaa.service.HospitapriceService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 开药记录
 */
@Service("hospitapriceService")
public class HospitapriceServiceImpl implements HospitapriceService {

    @Resource
    private HospitapriceDao hospitapriceDao;
    @Resource
    private RegisterDao registerDao;

    /**
     * 给病人开药记录，及消费增加
     * @param hospitalprice
     * @return
     */
    @Transactional
    @Override
    public int add(Hospitalprice hospitalprice) {
        registerDao.addPrice(hospitalprice.getRegisterid().getRegisterid(), hospitalprice.getRepiceprice());
        return hospitapriceDao.add(hospitalprice);
    }

    @Override
    public List<Hospitalprice> select(int id) {
        return hospitapriceDao.select(id);
    }
}
