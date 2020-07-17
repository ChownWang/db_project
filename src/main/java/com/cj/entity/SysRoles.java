package com.cj.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色(SysRoles)实体类
 *
 * @author makejava
 * @since 2020-07-17 16:56:08
 */
@Data
public class SysRoles implements Serializable {
    private static final long serialVersionUID = 253166919075907417L;

    private Long id;
    /**
     * 角色名称
     */
    private String name;
    /**
     * 备注
     */
    private String note;
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