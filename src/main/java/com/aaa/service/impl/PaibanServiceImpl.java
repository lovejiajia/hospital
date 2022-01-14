package com.aaa.service.impl;


import com.aaa.dao.PaibanDao;
import com.aaa.entity.PaiBan;
import com.aaa.service.PaibanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("paibanService")
public class PaibanServiceImpl implements PaibanService {
    @Resource
    private PaibanDao paibanDao;
    @Override
    public int add(PaiBan paiban) {
        return paibanDao.add(paiban);
    }

    @Override
    public int count(int doctorId) {
        return paibanDao.count(doctorId);
    }

    @Override
    public int update(PaiBan paiban) {
        return paibanDao.update(paiban);
    }

    @Override
    public List<PaiBan> queueList() {
        return paibanDao.queueList();
    }
}
