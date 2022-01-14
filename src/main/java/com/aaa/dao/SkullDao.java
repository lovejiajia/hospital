package com.aaa.dao;

import com.aaa.entity.Skull;

import java.util.List;

/**
 * 经办人
 */
public interface SkullDao {
    int addSkull(Skull skull);
    List<Skull> selectSkull(int id);
    int deleteById(int id);
}
