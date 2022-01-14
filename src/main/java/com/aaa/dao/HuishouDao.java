package com.aaa.dao;

import com.aaa.entity.Huishou;

import java.util.List;

/**
 * 药品过期回收记录
 */
public interface HuishouDao {
    int add(Huishou huishou);
    List<Huishou> select(String name);
}
