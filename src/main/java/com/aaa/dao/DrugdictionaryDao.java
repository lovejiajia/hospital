package com.aaa.dao;

import com.aaa.entity.Drugdictionary;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Drugdictionary)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public interface DrugdictionaryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param drugid 主键
     * @return 实例对象
     */
    Drugdictionary queryById(Integer drugid);

    /**
     * 查询指定行数据
     *
     * @param drugdictionary 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Drugdictionary> queryAllByLimit(Drugdictionary drugdictionary, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param drugdictionary 查询条件
     * @return 总行数
     */
    long count(Drugdictionary drugdictionary);

    /**
     * 新增数据
     *
     * @param drugdictionary 实例对象
     * @return 影响行数
     */
    int insert(Drugdictionary drugdictionary);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Drugdictionary> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Drugdictionary> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Drugdictionary> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Drugdictionary> entities);

    /**
     * 修改数据
     *
     * @param drugdictionary 实例对象
     * @return 影响行数
     */
    int update(Drugdictionary drugdictionary);

    /**
     * 通过主键删除数据
     *
     * @param drugid 主键
     * @return 影响行数
     */
    int deleteById(Integer drugid);

}

