package com.cj.service.impl;

import com.cj.common.exception.ServiceException;
import com.cj.dao.SysMenusDao;
import com.cj.entity.SysMenus;
import com.cj.service.SysMenusService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 资源管理(SysMenus)表服务实现类
 *
 * @author makejava
 * @since 2020-07-13 14:38:26
 */
@Service("sysMenusService")
public class SysMenusServiceImpl implements SysMenusService {
    @Resource
    private SysMenusDao sysMenusDao;

    @Override
    public List<Map<String, Object>> doFindObjects() {
        List<Map<String, Object>> list = sysMenusDao.doFindObjects();
        if (list == null || list.size() == 0) {
            throw new ServiceException("没有对应的菜单信息");
        }
        return list;
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysMenus queryById(Integer id) {
        return this.sysMenusDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<SysMenus> queryAllByLimit(int offset, int limit) {
        return this.sysMenusDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysMenus 实例对象
     * @return 实例对象
     */
    @Override
    public SysMenus insert(SysMenus sysMenus) {
        this.sysMenusDao.insert(sysMenus);
        return sysMenus;
    }

    /**
     * 修改数据
     *
     * @param sysMenus 实例对象
     * @return 实例对象
     */

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.sysMenusDao.deleteById(id) > 0;
    }
}