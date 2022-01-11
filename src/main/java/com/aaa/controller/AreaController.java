package com.aaa.controller;

import com.aaa.entity.Area;
import com.aaa.service.AreaService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Area)表控制层
 *
 * @author makejava
 * @since 2022-01-10 17:47:07
 */
@RestController
@RequestMapping("area")
public class AreaController {

    /**
     * Area queryById(Integer areaid);
     *     List<Area> queryList(Area area);
     *     int insert(Area area);
     *     int update(Area area);
     *     int deleteById(Integer areaid);
     * 服务对象
     */
    @Resource
    private AreaService areaService;

    /**
     * 查询生产地址
     */
    @GetMapping("queryList")
    public PageInfo queryList(Area area, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Area> list = areaService.queryList(area);
        PageInfo pageInfo = new PageInfo(list);
        return pageInfo;
    }

    /**
     * 查询单个生产地址
     */
    @GetMapping("queryById/{id}")
    public Area queryById(@PathVariable("id") Integer id) {
        return areaService.queryById(id);
    }

    /**
     * 新增数据
     *
     * @param area 实体
     * @return 新增结果
     */
    @PostMapping("insert")
    public String insert(Area area) {
        int i = areaService.insert(area);
        if (i == 1){
            return "添加成功";
        } else {
            return "添加失败";
        }
    }

    /**
     * 编辑数据
     *
     * @param area 实体
     * @return 编辑结果
     */
    @PutMapping("update")
    public String update(Area area) {
        int i = areaService.update(area);
        if (i == 1){
            return "添加成功";
        } else {
            return "添加失败";
        }
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("deleteById/{id}")
    public String deleteById(Integer id) {
        int i = areaService.deleteById(id);
        if (i == 1){
            return "添加成功";
        } else {
            return "添加失败";
        }
    }

}

