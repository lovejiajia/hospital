package com.aaa.controller;

import com.aaa.dao.RegisterDao;
import com.aaa.service.RegisterService;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * 病人出院
 */
@RequestMapping("sel")
public class RegisterEndController {

    @Resource
    private RegisterService registerService;

    @RequestMapping("registerend")
    public String registerEnd(int id){
        return registerService.endDate(id);
    }
}
