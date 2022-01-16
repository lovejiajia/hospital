package com.aaa.dao;

import com.aaa.entity.Moneytype;

import java.util.List;

/**
 * 优惠比例
 */
public interface MoneytypeDao {
    int add(Moneytype moneytype);
    List<Moneytype> select();
    int update(String precent);
}
