package com.aaa.dao;

import com.aaa.entity.Paiban;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Paiban)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
public interface PaibanDao {
    List<Paiban> findAllPaiban();
    int insertPaiban(Paiban paiban);
    int countPaiban(Integer id);
    int updatePaiban(Paiban paiban);
    int delectPaiban(Integer id);
}

