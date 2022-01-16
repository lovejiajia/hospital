package com.aaa.dao;

import com.aaa.entity.Projecttype;

import java.util.List;

/**
 * 住院门诊分类
 */
public interface ProjecttypeDao {
    int add(Projecttype projecttype);
    List<Projecttype> select();
}
