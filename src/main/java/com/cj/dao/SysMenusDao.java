package com.cj.dao;

import com.cj.entity.SysMenus;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 资源管理(SysMenus)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-13 14:38:25
 */
public interface SysMenusDao {

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
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<SysMenus> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysMenus 实例对象
     * @return 对象列表
     */
    List<SysMenus> queryAll(SysMenus sysMenus);

    /**
     * 新增数据
     *
     * @param sysMenus 实例对象
     * @return 影响行数
     */
    int insert(SysMenus sysMenus);

    /**
     * 修改数据
     *
     * @param sysMenus 实例对象
     * @return 影响行数
     */

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}