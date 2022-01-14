package com.aaa.dao;

import com.aaa.entity.Unit;

import java.util.List;

/**
 * 计量单位
 */
public interface UnitDao {
    int addUnit(Unit unit);
    List<Unit> selectUnit();
}
