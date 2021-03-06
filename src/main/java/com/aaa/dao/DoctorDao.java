package com.aaa.dao;

import com.aaa.entity.Doctor;

import java.util.List;

/**
 * 医生详情
 */
public interface DoctorDao {
    int addDoctor(Doctor doctor);
    int deleteDoctor(int id);
    List<Doctor> queryById(Doctor doctor);
}
