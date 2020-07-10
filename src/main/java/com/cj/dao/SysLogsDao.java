package com.cj.dao;

import com.cj.common.PageObject;
import com.cj.entity.SysLogs;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 系统日志(SysLogs)表数据库访问层
 *
 * @author makejava
 * @since 2020-07-10 10:20:34
 */
public interface SysLogsDao {
    /**
     * 根据用户名查询总记录数，如果没有用户则查询所有
     * @param username
     * @return
     */
    Integer getRowCount(String username);

    /**
     * 根据用户实现分页查询
     * @param username
     * @param startIndex
     * @param pageSize
     * @return
     */
    List<SysLogs> findPageObjects(String username,Integer startIndex,Integer pageSize);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysLogs queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<SysLogs> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sysLogs 实例对象
     * @return 对象列表
     */
    List<SysLogs> queryAll(SysLogs sysLogs);

    /**
     * 新增数据
     *
     * @param sysLogs 实例对象
     * @return 影响行数
     */
    int insert(SysLogs sysLogs);

    /**
     * 修改数据
     *
     * @param sysLogs 实例对象
     * @return 影响行数
     */
    int update(SysLogs sysLogs);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}