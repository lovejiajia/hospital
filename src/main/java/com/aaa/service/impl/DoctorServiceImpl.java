package com.aaa.service.impl;

import com.aaa.dao.DoctorDao;
import com.aaa.entity.Doctor;
import com.aaa.service.DoctorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("doctorService")
public class DoctorServiceImpl implements DoctorService {

    @Resource
    private DoctorDao doctorDao;


    @Override
    public int addDoctor(Doctor doctor) {
        return doctorDao.addDoctor(doctor);
    }

    @Override
    public int deleteDoctor(int id) {
        return doctorDao.deleteDoctor(id);
    }

    @Override
    public List<Doctor> queryById(Doctor doctor) {
        return doctorDao.queryById(doctor);
    }
}
