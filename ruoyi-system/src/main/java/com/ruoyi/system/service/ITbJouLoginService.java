package com.ruoyi.system.service;

import com.ruoyi.system.domain.TbJouLogin;
import java.util.List;

/**
 * 登录日志Service接口
 * 
 * @author ruoyi
 * @date 2019-11-07
 */
public interface ITbJouLoginService 
{
    /**
     * 查询登录日志
     * 
     * @param id 登录日志ID
     * @return 登录日志
     */
    public TbJouLogin selectTbJouLoginById(Long id);

    /**
     * 查询登录日志列表
     * 
     * @param tbJouLogin 登录日志
     * @return 登录日志集合
     */
    public List<TbJouLogin> selectTbJouLoginList(TbJouLogin tbJouLogin);

    /**
     * 新增登录日志
     * 
     * @param tbJouLogin 登录日志
     * @return 结果
     */
    public int insertTbJouLogin(TbJouLogin tbJouLogin);

    /**
     * 修改登录日志
     * 
     * @param tbJouLogin 登录日志
     * @return 结果
     */
    public int updateTbJouLogin(TbJouLogin tbJouLogin);

    /**
     * 批量删除登录日志
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbJouLoginByIds(String ids);

    /**
     * 删除登录日志信息
     * 
     * @param id 登录日志ID
     * @return 结果
     */
    public int deleteTbJouLoginById(Long id);
}
