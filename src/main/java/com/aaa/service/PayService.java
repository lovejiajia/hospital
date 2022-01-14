package com.aaa.service;

import com.aaa.entity.Pay;

import java.util.List;

public interface PayService {
    int add(Pay pay);
    List<Pay> select(int id);
}
