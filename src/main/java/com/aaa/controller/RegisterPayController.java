package com.aaa.controller;

import com.aaa.dao.PayDao;
import com.aaa.entity.Pay;
import com.aaa.entity.Register;
import com.aaa.service.PayService;
import com.aaa.service.RegisterService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 住院病人缴费及查询余额
 */
@RestController
@RequestMapping("sel")
public class RegisterPayController {

    @Resource
    private RegisterService registerService;
    @Resource
    private PayService payService;

    @RequestMapping("RegisterByBed")
    public List<Register> selectByBed(Register register){
        return registerService.queueListRegister(register);
    }

    @RequestMapping("pay")
    public PageInfo selectPayByRegister(Integer id,Integer page, Integer limit){
        PageHelper.startPage(page, limit);
        List<Pay> list = payService.select(id);
        PageInfo info = new PageInfo(list);
        return info;
    }

    @RequestMapping("addpay")
    public String addPay(Integer id, Double price){
        Pay pay = new Pay();
        Register register = new Register();
        register.setRegisterid(id);
        pay.setRegisterid(register);
        pay.setMoney(price);
        int i = payService.add(pay);
        if (i == 1){
            return "缴费成功";
        }else {
            return "缴费失败";
        }
    }
}
