package com.cj.dao;

import com.cj.common.pojo.Node;
import com.cj.entity.SysMenus;
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
     * 新增
     * @param entity
     * @return 1为成功
     */
    int insertObject(SysMenus entity);
    /**
     * 查询菜单
     * @return List
     */
    List<Node> findZtreeMenuNodes();
    /**
     * 查询所有
     * @return 实例对象
     */
    List<Map<String,Object>> doFindObjects();

    /**
     * 通过ID查询是否有父类节点
     *
     * @param id 主键
     * @return 实例对象
     */
    Integer queryParentById(Integer id);

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

    /**
     * 通过主键删除用户表数据
     * @param id 主键
     * @return 影响行数
     */
    int deleteRoleId(Integer id);

}