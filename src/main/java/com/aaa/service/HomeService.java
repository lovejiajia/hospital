package com.aaa.service;

import com.aaa.entity.Home;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Home)表服务接口
 *
 * @author makejava
 * @since 2022-01-10 17:47:10
 */
public interface HomeService {

    /**
     * 通过ID查询单条数据
     *
     * @param homeid 主键
     * @return 实例对象
     */
    Home queryById(Integer homeid);

    /**
     * 分页查询
     *
     * @param home 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Home> queryByPage(Home home, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param home 实例对象
     * @return 实例对象
     */
    Home insert(Home home);

    /**
     * 修改数据
     *
     * @param home 实例对象
     * @return 实例对象
     */
    Home update(Home home);

    /**
     * 通过主键删除数据
     *
     * @param homeid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer homeid);

}
