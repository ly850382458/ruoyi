package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TbJouLoginMapper;
import com.ruoyi.system.domain.TbJouLogin;
import com.ruoyi.system.service.ITbJouLoginService;
import com.ruoyi.common.core.text.Convert;

/**
 * 登录日志Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-11-07
 */
@Service
public class TbJouLoginServiceImpl implements ITbJouLoginService 
{
    @Autowired
    private TbJouLoginMapper tbJouLoginMapper;

    /**
     * 查询登录日志
     * 
     * @param id 登录日志ID
     * @return 登录日志
     */
    @Override
    public TbJouLogin selectTbJouLoginById(Long id)
    {
        return tbJouLoginMapper.selectTbJouLoginById(id);
    }

    /**
     * 查询登录日志列表
     * 
     * @param tbJouLogin 登录日志
     * @return 登录日志
     */
    @Override
    public List<TbJouLogin> selectTbJouLoginList(TbJouLogin tbJouLogin)
    {
        return tbJouLoginMapper.selectTbJouLoginList(tbJouLogin);
    }

    /**
     * 新增登录日志
     * 
     * @param tbJouLogin 登录日志
     * @return 结果
     */
    @Override
    public int insertTbJouLogin(TbJouLogin tbJouLogin)
    {
        return tbJouLoginMapper.insertTbJouLogin(tbJouLogin);
    }

    /**
     * 修改登录日志
     * 
     * @param tbJouLogin 登录日志
     * @return 结果
     */
    @Override
    public int updateTbJouLogin(TbJouLogin tbJouLogin)
    {
        return tbJouLoginMapper.updateTbJouLogin(tbJouLogin);
    }

    /**
     * 删除登录日志对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbJouLoginByIds(String ids)
    {
        return tbJouLoginMapper.deleteTbJouLoginByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除登录日志信息
     * 
     * @param id 登录日志ID
     * @return 结果
     */
    @Override
    public int deleteTbJouLoginById(Long id)
    {
        return tbJouLoginMapper.deleteTbJouLoginById(id);
    }
}
