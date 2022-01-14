package com.aaa.dao;

import com.aaa.entity.Bed;

import java.util.List;

/**
 * 床位
 */
public interface BedDao {
    int add(Bed bed);
    int delete(Bed bed);
    List<Bed> select(Bed bed);
    int updateBed(int bedid, int state);//更新床位状态，如病人住院出院
}
