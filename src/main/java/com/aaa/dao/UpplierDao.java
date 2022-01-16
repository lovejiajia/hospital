package com.aaa.dao;

import com.aaa.entity.Upplier;

import java.util.List;

/**
 * 供货商详情
 */
public interface UpplierDao {
    int addUpplier(Upplier upplier);
    List<Upplier> select(int id, String name);
    int update(int id, int state);//更新供货商状态，停供
}
