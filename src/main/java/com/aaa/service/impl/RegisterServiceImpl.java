package com.aaa.service.impl;

import com.aaa.entity.Register;
import com.aaa.service.RegisterService;
import com.aaa.dao.RegisterDao;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Register)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
@Service("registerService")
public class RegisterServiceImpl implements RegisterService {
    @Resource
    private RegisterDao registerDao;

    @Override
    public int addRedister(Register register) {
        return registerDao.addRedister(register);
    }

    @Override
    public List<Register> queueListRegister() {
        return registerDao.queueListRegister();
    }

    @Override
    public int deleteRedister(Integer id) {
        return registerDao.deleteRedister(id);
    }

    @Override
    public List<Register> queryByName(String name) {
        return registerDao.queryByName(name);
    }
}
