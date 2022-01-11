package com.aaa.controller;

import com.aaa.entity.Paiban;
import com.aaa.service.PaibanService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("Paiban")
public class PaibanController {

    @Resource
    private PaibanService paibanService;

    /**
     * List<Paiban> findAllPaiban();
     *     int insertPaiban();
     *     int countPaiban();
     *     int updatePaiban();
     *     int delectPaiban();
     */
    @RequestMapping("findAllPaiban")
    public PageInfo findAllPaiban(Paiban paiban, Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Paiban> list = paibanService.findAllPaiban();
        return new PageInfo(list);
    }

    @RequestMapping("updatePaiban")
    public String updatePaiban(Paiban paiban){
        int i = paibanService.countPaiban(paiban.getDoctorid());
        if (i == 0){
            i = paibanService.insertPaiban(paiban);
        } else {
            i = paibanService.updatePaiban(paiban);
        }
        if (i == 1){
            return "修改成功";
        }else {
            return "修改失败";
        }
    }

    @RequestMapping("delectPaiban")
    public String delectPaiban(Integer id){
        int i = paibanService.delectPaiban(id);
        if (i == 1){
            return "删除成功";
        }else {
            return "删除失败";
        }
    }
}
