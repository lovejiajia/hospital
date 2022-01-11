package com.aaa.service;

import com.aaa.entity.Paiban;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * (Paiban)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
public interface PaibanService {

    List<Paiban> findAllPaiban();
    int insertPaiban(Paiban paiban);
    int countPaiban(int id);
    int updatePaiban(Paiban paiban);
    int delectPaiban(int id);


}
