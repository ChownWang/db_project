package com.cj.service;

import com.cj.common.pojo.PageObject;
import com.cj.entity.SysRoles;

import java.util.List;

/**
 * 角色(SysRoles)表服务接口
 *
 * @author makejava
 * @since 2020-07-17 16:56:09
 */
public interface SysRolesService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysRoles queryById(Long id);

    /**
     * 根据name查询数据
     * @param name
     * @param pageCurrent
     * @return
     */
    PageObject<SysRoles> findPageObjects(
            String name,Integer pageCurrent);



}