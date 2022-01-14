package com.aaa.service.impl;

import com.aaa.dao.RegisterDao;
import com.aaa.entity.Register;
import com.aaa.service.RegisterService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("registerService")
public class RegisterServiceImpl implements RegisterService {

    @Resource
    private RegisterDao registerDao;

    @Override
    public int add(Register register) {
        return registerDao.add(register);
    }

    @Override
    public int delete(int id) {
        return registerDao.delete(id);
    }

    @Override
    public int update(Register register) {
        return registerDao.update(register);
    }

    @Override
    public List<Register> queueListRegister(Register register) {
        return registerDao.queueListRegister(register);
    }

    /**
     * 病人出院
     */
    @Transactional
    @Override
    public String endDate(int id) {
        Register register = new Register();
        register.setRegisterid(id);
        Register re = (Register) registerDao.queueListRegister(register);
        if (re.getMoney() < re.getPrice()){
            return "余额不足";
        } else {
            registerDao.endDate(id);
            return "出院成功";
        }
    }

}
