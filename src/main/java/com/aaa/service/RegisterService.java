package com.aaa.service;

import com.aaa.entity.Register;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Register)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public interface RegisterService {

    int addRedister(Register register);
    List<Register> queueListRegister();
    int deleteRedister(Integer id);
    List<Register> queryByName(String name);
}
