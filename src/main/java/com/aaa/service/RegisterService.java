package com.aaa.service;

import com.aaa.entity.Register;

import java.util.List;

public interface RegisterService {
    int add(Register register);
    int delete(int id);
    int update(Register register);
    List<Register> queueListRegister(Register register);
    String endDate(int id);
}
