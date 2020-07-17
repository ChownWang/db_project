package com.cj.service.impl;

import com.cj.common.exception.ServiceException;
import com.cj.common.pojo.PageObject;
import com.cj.dao.SysRolesDao;
import com.cj.entity.SysRoles;
import com.cj.service.SysRolesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色(SysRoles)表服务实现类
 *
 * @author makejava
 * @since 2020-07-17 16:56:09
 */
@Service("sysRolesService")
public class SysRolesServiceImpl implements SysRolesService {
    @Resource
    private SysRolesDao sysRolesDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysRoles queryById(Long id) {
        return this.sysRolesDao.queryById(id);
    }

    @Override
    public PageObject<SysRoles> findPageObjects(String name, Integer pageCurrent) {
        //1.对参数进行校验
        if (pageCurrent == null || pageCurrent < 1) {
            throw new IllegalArgumentException("当前页码值无效");
        }
        //2.查询总记录数并进行校验
        int rowCount = sysRolesDao.getRowCount(name);
        if (rowCount == 0) {
            throw new ServiceException("没有找到对应记录");
        }
        //3.查询当前页记录
        int pageSize = 2;
        int startIndex = (pageCurrent - 1) * pageSize;
        List<SysRoles> records =
                sysRolesDao.findPageObjects(name,
                        startIndex, pageSize);
        //4.对查询结果进行封装并返回
        return new PageObject<>(pageCurrent, pageSize,
                rowCount, records);

    }
}

