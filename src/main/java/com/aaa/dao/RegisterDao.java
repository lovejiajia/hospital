package com.aaa.dao;

import com.aaa.entity.Register;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Register)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public interface RegisterDao {
    int addRedister(Register register);
    List<Register> queueListRegister();
    int deleteRedister(Integer id);
    List<Register> queryByName(String name);
}

