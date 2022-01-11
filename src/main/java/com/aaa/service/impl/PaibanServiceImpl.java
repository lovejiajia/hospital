package com.aaa.service.impl;

import com.aaa.service.PaibanService;
import com.aaa.dao.PaibanDao;
import com.aaa.entity.Paiban;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Paiban)表服务实现类
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
@Service("paibanService")
public class PaibanServiceImpl implements PaibanService {
    @Resource
    private PaibanDao paibanDao;


    @Override
    public List<Paiban> findAllPaiban() {
        return paibanDao.findAllPaiban();
    }

    @Override
    public int insertPaiban(Paiban paiban) {
        return paibanDao.insertPaiban(paiban);
    }

    @Override
    public int countPaiban(int id) {
        return paibanDao.countPaiban(id);
    }

    @Override
    public int updatePaiban(Paiban paiban) {
        return paibanDao.updatePaiban(paiban);
    }

    @Override
    public int delectPaiban(int id) {
        return paibanDao.delectPaiban(id);
    }
}
