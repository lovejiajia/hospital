package com.aaa.dao;

import com.aaa.entity.Register;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 住院病人相关信息
 */
public interface RegisterDao {
    int add(Register register);
    int delete(int id);
    int update(Register register);
    List<Register> queueListRegister(Register register);//查询病人
    int addPrice(int id, Double price);//消费
    int addMoney(int id, Double price);//缴费
    int endDate(int id);//出院
}
