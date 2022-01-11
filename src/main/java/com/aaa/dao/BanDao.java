package com.aaa.dao;

import com.aaa.entity.Ban;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Ban)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-10 17:47:07
 */
public interface BanDao {


    int insert(Ban ban);
    int deleteById(Integer bid);

}

