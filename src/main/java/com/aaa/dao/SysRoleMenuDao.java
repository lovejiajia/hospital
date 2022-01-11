package com.aaa.dao;

import com.aaa.entity.SysRoleMenu;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (SysRoleMenu)表数据库访问层
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public interface SysRoleMenuDao {

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    SysRoleMenu queryById(Integer rid);

    /**
     * 查询指定行数据
     *
     * @param sysRoleMenu 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<SysRoleMenu> queryAllByLimit(SysRoleMenu sysRoleMenu, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param sysRoleMenu 查询条件
     * @return 总行数
     */
    long count(SysRoleMenu sysRoleMenu);

    /**
     * 新增数据
     *
     * @param sysRoleMenu 实例对象
     * @return 影响行数
     */
    int insert(SysRoleMenu sysRoleMenu);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysRoleMenu> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<SysRoleMenu> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<SysRoleMenu> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<SysRoleMenu> entities);

    /**
     * 修改数据
     *
     * @param sysRoleMenu 实例对象
     * @return 影响行数
     */
    int update(SysRoleMenu sysRoleMenu);

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 影响行数
     */
    int deleteById(Integer rid);

}

