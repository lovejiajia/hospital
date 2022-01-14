package com.aaa.dao;

import com.aaa.entity.Home;

import java.util.List;

/**
 * 门诊病人
 */
public interface HomeDao {
    int addHome(Home home);
    List<Home> selectHome();
}
