package com.aaa.dao;

import com.aaa.entity.Hospitalprice;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Hospitalprice)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-10 17:47:10
 */
public interface HospitalpriceDao {

    /**
     * 通过ID查询单条数据
     *
     * @param hospitalpriceid 主键
     * @return 实例对象
     */
    Hospitalprice queryById(Integer hospitalpriceid);

    /**
     * 查询指定行数据
     *
     * @param hospitalprice 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Hospitalprice> queryAllByLimit(Hospitalprice hospitalprice, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param hospitalprice 查询条件
     * @return 总行数
     */
    long count(Hospitalprice hospitalprice);

    /**
     * 新增数据
     *
     * @param hospitalprice 实例对象
     * @return 影响行数
     */
    int insert(Hospitalprice hospitalprice);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Hospitalprice> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Hospitalprice> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Hospitalprice> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Hospitalprice> entities);

    /**
     * 修改数据
     *
     * @param hospitalprice 实例对象
     * @return 影响行数
     */
    int update(Hospitalprice hospitalprice);

    /**
     * 通过主键删除数据
     *
     * @param hospitalpriceid 主键
     * @return 影响行数
     */
    int deleteById(Integer hospitalpriceid);

}

