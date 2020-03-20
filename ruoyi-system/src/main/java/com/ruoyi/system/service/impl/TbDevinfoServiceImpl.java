package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TbDevinfoMapper;
import com.ruoyi.system.domain.TbDevinfo;
import com.ruoyi.system.service.ITbDevinfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 设备基本信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-11-17
 */
@Service
public class TbDevinfoServiceImpl implements ITbDevinfoService 
{
    @Autowired
    private TbDevinfoMapper tbDevinfoMapper;

    /**
     * 查询设备基本信息
     * 
     * @param devId 设备基本信息ID
     * @return 设备基本信息
     */
    @Override
    public TbDevinfo selectTbDevinfoById(Long devId)
    {
        return tbDevinfoMapper.selectTbDevinfoById(devId);
    }

    /**
     * 查询设备基本信息列表
     * 
     * @param tbDevinfo 设备基本信息
     * @return 设备基本信息
     */
    @Override
    public List<TbDevinfo> selectTbDevinfoList(TbDevinfo tbDevinfo)
    {
        return tbDevinfoMapper.selectTbDevinfoList(tbDevinfo);
    }

    /**
     * 新增设备基本信息
     * 
     * @param tbDevinfo 设备基本信息
     * @return 结果
     */
    @Override
    public int insertTbDevinfo(TbDevinfo tbDevinfo)
    {
        return tbDevinfoMapper.insertTbDevinfo(tbDevinfo);
    }

    /**
     * 修改设备基本信息
     * 
     * @param tbDevinfo 设备基本信息
     * @return 结果
     */
    @Override
    public int updateTbDevinfo(TbDevinfo tbDevinfo)
    {
        return tbDevinfoMapper.updateTbDevinfo(tbDevinfo);
    }

    /**
     * 删除设备基本信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbDevinfoByIds(String ids)
    {
        return tbDevinfoMapper.deleteTbDevinfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备基本信息信息
     * 
     * @param devId 设备基本信息ID
     * @return 结果
     */
    @Override
    public int deleteTbDevinfoById(Long devId)
    {
        return tbDevinfoMapper.deleteTbDevinfoById(devId);
    }
}
