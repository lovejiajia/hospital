package com.aaa.dao;

import com.aaa.entity.Inoutpatienttype;

import java.util.List;

/**
 * 手术价格
 */
public interface InoutpatienttypeDao {
    int add(Inoutpatienttype inoutpatienttype);
    List<Inoutpatienttype> select(String name);
}
