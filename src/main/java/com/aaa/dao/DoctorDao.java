package com.aaa.dao;

import com.aaa.entity.Doctor;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Doctor)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public interface DoctorDao {

    /**
     * 通过ID查询单条数据
     *
     * @param doctorid 主键
     * @return 实例对象
     */
    Doctor queryById(Integer doctorid);

    /**
     * 查询指定行数据
     *
     * @param doctor 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Doctor> queryAllByLimit(Doctor doctor, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param doctor 查询条件
     * @return 总行数
     */
    long count(Doctor doctor);

    /**
     * 新增数据
     *
     * @param doctor 实例对象
     * @return 影响行数
     */
    int insert(Doctor doctor);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Doctor> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Doctor> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Doctor> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Doctor> entities);

    /**
     * 修改数据
     *
     * @param doctor 实例对象
     * @return 影响行数
     */
    int update(Doctor doctor);

    /**
     * 通过主键删除数据
     *
     * @param doctorid 主键
     * @return 影响行数
     */
    int deleteById(Integer doctorid);

}

