package com.aaa.controller;

import com.aaa.entity.Ban;
import com.aaa.service.BanService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Ban)表控制层
 *
 * @author makejava
 * @since 2022-01-10 17:47:07
 */
@RestController
@RequestMapping("ban")
public class BanController {
    /**
     * 服务对象
     */
    @Resource
    private BanService banService;

    /**
     * 新增数据
     *
     * @param ban 实体
     * @return 新增结果
     */
    @PostMapping
    public String add(Ban ban) {
        int i = banService.insert(ban);
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
    @DeleteMapping
    public String deleteById(Integer id) {
        int i = banService.deleteById(id);
        if (i == 1){
            return "添加成功";
        } else {
            return "添加失败";
        }
    }

}

