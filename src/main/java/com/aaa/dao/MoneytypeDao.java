package com.aaa.dao;

import com.aaa.entity.Moneytype;

import java.util.List;

public interface MoneytypeDao {
    int add(Moneytype moneytype);
    List<Moneytype> select();
    int update(String precent);
}
