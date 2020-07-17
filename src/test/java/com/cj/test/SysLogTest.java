package com.cj.test;

import com.cj.dao.SysLogsDao;
import com.cj.dao.SysMenusDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @ClassName SysLogTest
 * @Description 测试类
 * @Author ChownWang
 * @Date 2020/7/10 17:39
 * @Version 1.0
 */
@SpringBootTest
public class SysLogTest {

    @Resource
    private SysLogsDao sysLogsDao;

    @Resource
    private SysMenusDao sysMenusDao;

    @Test
    void logTest(){
        Integer integer = sysLogsDao.doDeleteObjects(11,12,13);
        System.out.println(integer);
    }
    @Test
    void menuTest(){

    }

}
