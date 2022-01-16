package com.aaa.service;

import com.aaa.dao.InoutpatienttypeDao;
import com.aaa.entity.Inoutpatienttype;

import java.util.List;

public interface InoutpatienttypreService {

    int add(Inoutpatienttype inoutpatienttype);
    List<Inoutpatienttype> select(String name);
}
