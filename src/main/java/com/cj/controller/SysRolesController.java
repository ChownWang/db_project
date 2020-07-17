package com.cj.controller;

import com.cj.common.pojo.JsonResult;
import com.cj.entity.SysRoles;
import com.cj.service.SysRolesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色(SysRoles)表控制层
 *
 * @author makejava
 * @since 2020-07-17 16:56:09
 */
@RestController
public class SysRolesController {
    /**
     * 服务对象
     */
    @Resource
    private SysRolesService sysRolesService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysRoles selectOne(Long id) {
        return this.sysRolesService.queryById(id);
    }

    @GetMapping("role/doFindPageObjects")
    public JsonResult doFindPageObjects(String name,Integer pageCurrent){
        return new JsonResult(sysRolesService.findPageObjects(name,pageCurrent));
    }

}