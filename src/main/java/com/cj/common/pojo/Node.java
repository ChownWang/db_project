package com.cj.common.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName Node
 * @Description 定义值对象封装查询到的上级菜单id，name，parentId信息
 * @Author ChownWang
 * @Date 2020/7/17 9:24
 * @Version 1.0
 */
@Data
public class Node implements Serializable {
    private static final long serialVersionUID = 5395349592603206323L;

    private Integer id;
    private String name;
    private Integer parentId;
}
