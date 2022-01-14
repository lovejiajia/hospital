package com.aaa.service.impl;

import com.aaa.dao.BedDao;
import com.aaa.entity.Bed;
import com.aaa.service.BedService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("bedService")
public class BedServiceImpl implements BedService {

    @Resource
    private BedDao bedDao;
    @Override
    public int add(Bed bed) {
        return bedDao.add(bed);
    }

    @Override
    public int delete(Bed bed) {
        return bedDao.delete(bed);
    }

    @Override
    public List<Bed> select(Bed bed) {
        return bedDao.select(bed);
    }
}
