package com.aaa.dao;

import com.aaa.entity.Doctor;

/**
 * 医生详情
 */
public interface DoctorDao {
    int addDoctor(Doctor doctor);
    int deleteDoctor(int id);
    int queryById(Doctor doctor);
}
