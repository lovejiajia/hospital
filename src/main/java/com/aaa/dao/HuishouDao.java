package com.aaa.dao;

import com.aaa.entity.Huishou;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Huishou)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-10 17:47:10
 */
public interface HuishouDao {

    /**
     * 通过ID查询单条数据
     *
     * @param huishouid 主键
     * @return 实例对象
     */
    Huishou queryById(Integer huishouid);

    /**
     * 查询指定行数据
     *
     * @param huishou 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Huishou> queryAllByLimit(Huishou huishou, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param huishou 查询条件
     * @return 总行数
     */
    long count(Huishou huishou);

    /**
     * 新增数据
     *
     * @param huishou 实例对象
     * @return 影响行数
     */
    int insert(Huishou huishou);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Huishou> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Huishou> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Huishou> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Huishou> entities);

    /**
     * 修改数据
     *
     * @param huishou 实例对象
     * @return 影响行数
     */
    int update(Huishou huishou);

    /**
     * 通过主键删除数据
     *
     * @param huishouid 主键
     * @return 影响行数
     */
    int deleteById(Integer huishouid);

}

