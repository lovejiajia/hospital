package com.aaa.dao;

import com.aaa.entity.Projecttype;

import java.util.List;

public interface ProjecttypeDao {
    int add(Projecttype projecttype);
    List<Projecttype> select();
}
