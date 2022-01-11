package com.aaa.controller;

import com.aaa.entity.Register;
import com.aaa.service.RegisterService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("register")
public class RegisterController {
    /**
     * int addRedister(Register register);
     *     List<Register> queueListRegister();
     *     int deleteRedister(Integer id);
     *     Register queryByName(String name);
     */
    @Resource
    private RegisterService registerService;

    @RequestMapping("add")
    public String add(Register register){
        int i = registerService.addRedister(register);
        if (i == 1){
            return "添加成功";
        } else {
            return "添加失败";
        }
    }

    @RequestMapping("queryList")
    public PageInfo queryListRegister(Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Register> list = registerService.queueListRegister();
        PageInfo info = new PageInfo(list);
        return info;
    }

    @RequestMapping("delete")
    public String deleteRedister(Integer id){
        int i = registerService.deleteRedister(id);
        if (i == 1){
            return "删除成功";
        } else {
            return "删除失败";
        }
    }
    @RequestMapping("query")
    public PageInfo queryByName(String name, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Register> list = registerService.queryByName(name);
        PageInfo info = new PageInfo(list);
        return info;
    }

}
