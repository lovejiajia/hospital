package com.aaa.service;

import com.aaa.entity.Doctor;

import java.util.List;

public interface DoctorService {
    int addDoctor(Doctor doctor);
    int deleteDoctor(int id);
    List<Doctor> queryById(Doctor doctor);
}
