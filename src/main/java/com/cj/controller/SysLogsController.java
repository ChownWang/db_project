package com.cj.controller;

import com.cj.common.JsonResult;
import com.cj.common.PageObject;
import com.cj.entity.SysLogs;
import com.cj.service.SysLogsService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 系统日志(SysLogs)表控制层
 *
 * @author makejava
 * @since 2020-07-10 10:20:38
 */
@RestController
@RequestMapping("/log")
public class SysLogsController {
    /**
     * 服务对象
     */
    @Resource
    private SysLogsService sysLogsService;

    /*@RequestMapping("/doPageUI")
    public List<SysLogs> doPageUI(){
        List<SysLogs> list = sysLogsService.queryAllByLimit(0, 10);
        return list;
    }*/

    @GetMapping("/doFindPageObjects")
    public JsonResult doFindPageObjects(String username,Integer pageCurrent){
        System.out.println("pageCurrent:"+pageCurrent);
        PageObject<SysLogs> pageObjects = sysLogsService.findPageObjects(username, pageCurrent);
        return new JsonResult(pageObjects);
    }

    @RequestMapping("/doDeleteObjects")
    public JsonResult doDeleteObjects(Integer... ids){
        return sysLogsService.doDeleteObjects(ids);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysLogs selectOne(Long id) {
        return this.sysLogsService.queryById(id);
    }

}