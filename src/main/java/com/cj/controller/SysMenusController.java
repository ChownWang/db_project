package com.cj.controller;

import com.cj.common.pojo.JsonResult;
import com.cj.entity.SysMenus;
import com.cj.service.SysMenusService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @RequestMapping("menu/doDeleteObject")
    public JsonResult doDeleteObject(Integer id){
        sysMenusService.doDeleteObject(id);
        return new JsonResult("delete ok");
    }

    @RequestMapping("menu/doFindZtreeMenuNodes")
    public JsonResult doFindZtreeMenuNodes(){
        return new JsonResult(
                sysMenusService.findZtreeMenuNodes());
    }

    @RequestMapping("menu/doSaveObject")
    public JsonResult doSaveObject(SysMenus entity){
        sysMenusService.saveObject(entity);
        return new JsonResult("save ok");
    }


}