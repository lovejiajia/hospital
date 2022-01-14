package com.aaa.dao;

import com.aaa.entity.Warehuose;

import java.util.List;

/**
 * 药房
 */
public interface WarehuoseDao {
    int addWarehuose(Warehuose warehuose);
    List<Warehuose> select();
}
