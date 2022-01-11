package com.aaa.dao;

import com.aaa.entity.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (SysUser)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-10 17:47:13
 */
public interface SysUserDao {
    SysUser queryByname(String username);
}

