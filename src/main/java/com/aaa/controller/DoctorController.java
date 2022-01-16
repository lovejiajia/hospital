package com.aaa.controller;

import com.aaa.entity.Doctor;
import com.aaa.service.DoctorService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 医生统计
 */
@RequestMapping("sta")
@RestController
public class DoctorController {
    private DoctorService doctorService;

    @RequestMapping("addDoctor")
    public int add(Doctor doctor){
        return doctorService.addDoctor(doctor);
    }

    @RequestMapping("selDoctor")
    public PageInfo selDoctor(Doctor doctor, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Doctor> list = doctorService.queryById(doctor);
        PageInfo info = new PageInfo(list);
        return info;
    }


}
