package com.aaa.controller;

import com.aaa.entity.Deparment;
import com.aaa.entity.Doctor;
import com.aaa.entity.Register;
import com.aaa.service.RegisterService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 住院部病人
 */
@RestController
@RequestMapping("sel")
public class RegisterController {
    @Resource
    private RegisterService registerService;

    @RequestMapping("seleteregister")
    public PageInfo seleteRegister(Register register, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Register> list = registerService.queueListRegister(register);
        System.out.println(list.toString());
        PageInfo info = new PageInfo(list);
        return info;
    }


    @RequestMapping("updateRegister")
    public String updateRegister(Register register,Integer doctorId,Integer deparment){
        Deparment deparment1 = new Deparment();
        deparment1.setId(deparment);
        Doctor doctor = new Doctor();
        doctor.setDoctorId(doctorId);
        register.setDoctor(doctor);
        register.setDepartment(deparment1);
        int i = registerService.update(register);
        if (i == 1){
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    @RequestMapping("deleteRegister")
    public String deleteRegister(Integer id){
        int i = registerService.delete(id);
        if (i == 1){
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    @RequestMapping("add")
    public String add(Register register){
        int i = registerService.add(register);
        if (i == 1){
            return "添加成功";
        } else {
            return "添加失败";
        }
    }
}
