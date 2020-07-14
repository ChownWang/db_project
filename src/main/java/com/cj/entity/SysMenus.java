package com.cj.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 资源管理(SysMenus)实体类
 *
 * @author makejava
 * @since 2020-07-13 14:38:19
 */
@Data
public class SysMenus implements Serializable {
    private static final long serialVersionUID = -14483601713577675L;

    private Integer id;
    /**
     * 资源名称
     */
    private String name;
    /**
     * 资源URL
     */
    private String url;
    /**
     * 类型     1：菜单   2：按钮
     */
    private Integer type;
    /**
     * 排序
     */
    private Integer sort;
    /**
     * 备注
     */
    private String note;
    /**
     * 父菜单ID，一级菜单为0
     */
    private Integer parentId;
    /**
     * 授权(如：user:create)
     */
    private String permission;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 修改时间
     */
    private Date modifiedTime;
    /**
     * 创建用户
     */
    private String createdUser;
    /**
     * 修改用户
     */
    private String modifiedUser;


}