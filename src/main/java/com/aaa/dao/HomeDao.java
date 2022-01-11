package com.aaa.dao;

import com.aaa.entity.Home;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Home)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-10 17:47:10
 */
public interface HomeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param homeid 主键
     * @return 实例对象
     */
    Home queryById(Integer homeid);

    /**
     * 查询指定行数据
     *
     * @param home 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Home> queryAllByLimit(Home home, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param home 查询条件
     * @return 总行数
     */
    long count(Home home);

    /**
     * 新增数据
     *
     * @param home 实例对象
     * @return 影响行数
     */
    int insert(Home home);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Home> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Home> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Home> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Home> entities);

    /**
     * 修改数据
     *
     * @param home 实例对象
     * @return 影响行数
     */
    int update(Home home);

    /**
     * 通过主键删除数据
     *
     * @param homeid 主键
     * @return 影响行数
     */
    int deleteById(Integer homeid);

}

