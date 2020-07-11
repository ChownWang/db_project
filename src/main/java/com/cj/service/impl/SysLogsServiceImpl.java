package com.cj.service.impl;

import com.cj.common.JsonResult;
import com.cj.common.PageObject;
import com.cj.entity.SysLogs;
import com.cj.dao.SysLogsDao;
import com.cj.exception.ServiceException;
import com.cj.service.SysLogsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 系统日志(SysLogs)表服务实现类
 *
 * @author makejava
 * @since 2020-07-10 10:20:37
 */
@Service("sysLogsService")
public class SysLogsServiceImpl implements SysLogsService {
    @Resource
    private SysLogsDao sysLogsDao;

    @Override
    public PageObject<SysLogs> findPageObjects(String username, Integer pageCurrent) {
        //1.参数校验(说明：非空校验一定要在第一步)
        if(pageCurrent==null||pageCurrent<1){
           throw  new IllegalArgumentException("页码值不正确！");
        }
        //2.查询总记录数
        Integer records = sysLogsDao.getRowCount(username);
        if (records == 0){
            throw  new ServiceException("请输入正确的用户名!");
        }
        //3.每页需要显示的条数
        Integer pageSize = 3 ;
        //设置起始位置
        int startIndex = (pageCurrent-1) * pageSize;
        //查询数据库
        List<SysLogs> pageObjects = sysLogsDao.findPageObjects(username, startIndex, pageSize);

        return new PageObject<>(pageCurrent,records,pageSize,pageObjects);
    }

    @Override
    public JsonResult doDeleteObjects(Integer... ids) {
        Integer integer = sysLogsDao.doDeleteObjects(ids);
        if (integer!=null&&integer>0){
            return new JsonResult("已经成功删除"+integer+"条数据!!!");
        }else {
            return new JsonResult("删除失败!!!");
        }
    }

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public SysLogs queryById(Long id) {
        return this.sysLogsDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<SysLogs> queryAllByLimit(int offset, int limit) {
        return this.sysLogsDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sysLogs 实例对象
     * @return 实例对象
     */
    @Override
    public SysLogs insert(SysLogs sysLogs) {
        this.sysLogsDao.insert(sysLogs);
        return sysLogs;
    }

    /**
     * 修改数据
     *
     * @param sysLogs 实例对象
     * @return 实例对象
     */
    @Override
    public SysLogs update(SysLogs sysLogs) {
        this.sysLogsDao.update(sysLogs);
        return this.queryById(sysLogs.getId());
    }
}