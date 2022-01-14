package com.aaa.dao;

import com.aaa.entity.Type;

import java.util.List;

/**
 * 药品类型
 */
public interface TypeDao {
    int addType(Type type);
    List<Type> selectType();
}
