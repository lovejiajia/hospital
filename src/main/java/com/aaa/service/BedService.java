package com.aaa.service;

import com.aaa.entity.Bed;

import java.util.List;

public interface BedService {
    int add(Bed bed);
    int delete(Bed bed);
    List<Bed> select(Bed bed);
}
