package com.aaa.service;

import com.aaa.entity.PaiBan;

import java.util.List;

public interface PaibanService {
    int add(PaiBan paiban);
    int count(int doctorId);
    int update(PaiBan paiban);
    List<PaiBan> queueList();
}
