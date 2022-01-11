package com.aaa.dao;

import com.aaa.entity.Drugstore;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Drugstore)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public interface DrugstoreDao {

    /**
     * 通过ID查询单条数据
     *
     * @param rugstoreid 主键
     * @return 实例对象
     */
    Drugstore queryById(Integer rugstoreid);

    /**
     * 查询指定行数据
     *
     * @param drugstore 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Drugstore> queryAllByLimit(Drugstore drugstore, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param drugstore 查询条件
     * @return 总行数
     */
    long count(Drugstore drugstore);

    /**
     * 新增数据
     *
     * @param drugstore 实例对象
     * @return 影响行数
     */
    int insert(Drugstore drugstore);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Drugstore> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Drugstore> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Drugstore> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Drugstore> entities);

    /**
     * 修改数据
     *
     * @param drugstore 实例对象
     * @return 影响行数
     */
    int update(Drugstore drugstore);

    /**
     * 通过主键删除数据
     *
     * @param rugstoreid 主键
     * @return 影响行数
     */
    int deleteById(Integer rugstoreid);

}

