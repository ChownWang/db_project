package com.cj.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * 系统日志(SysLogs)实体类
 *
 * @author makejava
 * @since 2020-07-10 10:20:31
 */
@Data
public class SysLogs implements Serializable {
    private static final long serialVersionUID = 496595598273452500L;
    
    private Long id;
    /**
    * 用户名
    */
    private String username;
    /**
    * 用户操作
    */
    private String operation;
    /**
    * 请求方法
    */
    private String method;
    /**
    * 请求参数
    */
    private String params;
    /**
    * 执行时长(毫秒)
    */
    private Long time;
    /**
    * IP地址
    */
    private String ip;
    /**
    * 创建时间
    */
    @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm")
    @JsonFormat(pattern = "yyyy/MM/dd HH:mm",timezone = "Asia/Shanghai")
    private Date createdTime;

}