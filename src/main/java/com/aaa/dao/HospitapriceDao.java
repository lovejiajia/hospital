package com.aaa.dao;

import com.aaa.entity.Hospitalprice;

import java.util.List;

/**
 * 住院消费记录表（病人开的药、及项目）
 */
public interface HospitapriceDao {
    int add(Hospitalprice hospitalprice);
    List<Hospitalprice> select(int id);
}
