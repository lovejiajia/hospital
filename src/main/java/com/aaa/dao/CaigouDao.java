package com.aaa.dao;

import com.aaa.entity.Caigou;

import java.util.List;

/**
 * 采购数量
 */
public interface CaigouDao {
    int addCaigou(Caigou caigou);
    List<Caigou> selectCaigou(String name);
}
