package com.cj.controller;

import com.cj.common.pojo.JsonResult;
import com.cj.entity.SysMenus;
import com.cj.service.SysMenusService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 资源管理(SysMenus)表控制层
 *
 * @author makejava
 * @since 2020-07-13 14:38:27
 */
@RestController
public class SysMenusController {
    /**
     * 服务对象
     */
    @Resource
    private SysMenusService sysMenusService;

    @RequestMapping("menu/doFindObjects")
    public JsonResult doFindObjects(){

        return new JsonResult(sysMenusService.doFindObjects());
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysMenus selectOne(Integer id) {
        return this.sysMenusService.queryById(id);
    }

}