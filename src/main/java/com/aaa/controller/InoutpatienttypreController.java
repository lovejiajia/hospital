package com.aaa.controller;

import com.aaa.entity.Inoutpatienttype;
import com.aaa.service.InoutpatienttypreService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("sel")
@RestController
public class InoutpatienttypreController {

    @Resource
    private InoutpatienttypreService inout;

    @RequestMapping("addInout")
    public int add(Inoutpatienttype inoutpatienttype){
        return inout.add(inoutpatienttype);
    }

    @RequestMapping("selectInout")
    public PageInfo select(String name,Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Inoutpatienttype> list = inout.select(name);
        PageInfo info = new PageInfo(list);
        return info;
    }
}
