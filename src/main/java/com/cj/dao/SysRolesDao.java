package com.cj.dao;

import com.cj.entity.SysRoles;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 角色(SysRoles)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-17 16:56:09
 */
public interface SysRolesDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysRoles queryById(Long id);

    /**
     *
     * @param name
     * @return
     */
    int getRowCount(String name);

    /**
     *
     * @param name
     * @param startIndex
     * @param pageSize
     * @return
     */
    List<SysRoles> findPageObjects(
            String  name,
            Integer startIndex,
            Integer pageSize);


}