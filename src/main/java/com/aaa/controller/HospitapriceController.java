package com.aaa.controller;

import com.aaa.entity.Hospitalprice;
import com.aaa.service.HospitapriceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 住院病人拿药记录
 */
@RequestMapping("sel")
@RestController
public class HospitapriceController {
    @Resource
    private HospitapriceService hospitapriceService;

    @RequestMapping("hospitaprice")
    public String addRigis(Hospitalprice hospitalprice){
        return hospitapriceService.add(hospitalprice) == 1 ? "添加成功" : "添加失败";
    }

}
