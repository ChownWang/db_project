package com.cj.service;

import com.cj.entity.SysMenus;

import java.util.List;
import java.util.Map;

/**
 * 资源管理(SysMenus)表服务接口
 *
 * @author makejava
 * @since 2020-07-13 14:38:26
 */
public interface SysMenusService {

    /**
     * 查询所有
     * @return 实例对象
     */
    List<Map<String,Object>> doFindObjects();

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysMenus queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysMenus> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sysMenus 实例对象
     * @return 实例对象
     */
    SysMenus insert(SysMenus sysMenus);


    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}