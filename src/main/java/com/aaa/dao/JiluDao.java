package com.aaa.dao;

import com.aaa.entity.Jilu;

import java.util.Date;
import java.util.List;

/**
 * 药品出药房记录
 */
public interface JiluDao {
    int add(Jilu jilu);
    List<Jilu> select(Date beginDate, Date endDate);
    int update(String name,int number);
}
