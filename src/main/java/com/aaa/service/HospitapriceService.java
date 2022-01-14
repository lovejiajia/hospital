package com.aaa.service;

import com.aaa.entity.Hospitalprice;

import java.util.List;

public interface HospitapriceService {
    int add(Hospitalprice hospitalprice);
    List<Hospitalprice> select(int id);
}
