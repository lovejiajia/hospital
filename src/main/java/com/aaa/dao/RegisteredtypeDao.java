package com.aaa.dao;

import com.aaa.entity.Registeredtype;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Registeredtype)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public interface RegisteredtypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param registeredid 主键
     * @return 实例对象
     */
    Registeredtype queryById(Integer registeredid);

    /**
     * 查询指定行数据
     *
     * @param registeredtype 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Registeredtype> queryAllByLimit(Registeredtype registeredtype, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param registeredtype 查询条件
     * @return 总行数
     */
    long count(Registeredtype registeredtype);

    /**
     * 新增数据
     *
     * @param registeredtype 实例对象
     * @return 影响行数
     */
    int insert(Registeredtype registeredtype);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Registeredtype> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Registeredtype> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Registeredtype> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Registeredtype> entities);

    /**
     * 修改数据
     *
     * @param registeredtype 实例对象
     * @return 影响行数
     */
    int update(Registeredtype registeredtype);

    /**
     * 通过主键删除数据
     *
     * @param registeredid 主键
     * @return 影响行数
     */
    int deleteById(Integer registeredid);

}

