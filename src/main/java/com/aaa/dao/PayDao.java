package com.aaa.dao;

import com.aaa.entity.Pay;

import java.util.List;

/**
 * 缴费记录详情
 */
public interface PayDao {
    int add(Pay pay);
    List<Pay> select(int id);
}
