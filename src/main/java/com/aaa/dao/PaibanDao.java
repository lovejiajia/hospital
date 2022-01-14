package com.aaa.dao;

import com.aaa.entity.PaiBan;

import java.util.List;

/**
 * 医生排班详情
 */
public interface PaibanDao {
    int add(PaiBan paiban);
    int count(int doctorId);
    int update(PaiBan paiban);
    List queueList();
}
