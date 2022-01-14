package com.aaa.controller;

import com.aaa.entity.Area;
import com.aaa.entity.PaiBan;
import com.aaa.service.AreaService;
import com.aaa.service.PaibanService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Area)表控制层
 *
 * @author makejava
 * @since 2022-01-12 13:29:07
 */
@RestController
@RequestMapping("sel")
public class PaibanController {

    @Resource
    private PaibanService paibanService;

    @RequestMapping("pai/queueList")
    public PageInfo aaaaa(){
        PageHelper.startPage(1,5);
        List<PaiBan> list = paibanService.queueList();
        PageInfo info = new PageInfo(list);
        return info;
    }
}

