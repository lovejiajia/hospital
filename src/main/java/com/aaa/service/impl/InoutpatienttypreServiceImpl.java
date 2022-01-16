package com.aaa.service.impl;

import com.aaa.dao.InoutpatienttypeDao;
import com.aaa.entity.Inoutpatienttype;
import com.aaa.service.InoutpatienttypreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("InoutpatienttypreService")
public class InoutpatienttypreServiceImpl implements InoutpatienttypreService {

    @Resource
    private InoutpatienttypeDao inoutpatienttypeDao;
    @Override
    public int add(Inoutpatienttype inoutpatienttype) {
        return inoutpatienttypeDao.add(inoutpatienttype);
    }

    @Override
    public List<Inoutpatienttype> select(String name) {
        return inoutpatienttypeDao.select(name);
    }
}
