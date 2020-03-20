package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TbDevchnnMapper;
import com.ruoyi.system.domain.TbDevchnn;
import com.ruoyi.system.service.ITbDevchnnService;
import com.ruoyi.common.core.text.Convert;

/**
 * 设备通道信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-12-05
 */
@Service
public class TbDevchnnServiceImpl implements ITbDevchnnService 
{
    @Autowired
    private TbDevchnnMapper tbDevchnnMapper;

    /**
     * 查询设备通道信息
     * 
     * @param id 设备通道信息ID
     * @return 设备通道信息
     */
    @Override
    public TbDevchnn selectTbDevchnnById(Long id)
    {
        return tbDevchnnMapper.selectTbDevchnnById(id);
    }

    /**
     * 查询设备通道信息列表
     * 
     * @param tbDevchnn 设备通道信息
     * @return 设备通道信息
     */
    @Override
    public List<TbDevchnn> selectTbDevchnnList(TbDevchnn tbDevchnn)
    {
        return tbDevchnnMapper.selectTbDevchnnList(tbDevchnn);
    }

    /**
     * 新增设备通道信息
     * 
     * @param tbDevchnn 设备通道信息
     * @return 结果
     */
    @Override
    public int insertTbDevchnn(TbDevchnn tbDevchnn)
    {
        return tbDevchnnMapper.insertTbDevchnn(tbDevchnn);
    }

    /**
     * 修改设备通道信息
     * 
     * @param tbDevchnn 设备通道信息
     * @return 结果
     */
    @Override
    public int updateTbDevchnn(TbDevchnn tbDevchnn)
    {
        return tbDevchnnMapper.updateTbDevchnn(tbDevchnn);
    }

    /**
     * 删除设备通道信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbDevchnnByIds(String ids)
    {
        return tbDevchnnMapper.deleteTbDevchnnByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除设备通道信息信息
     * 
     * @param id 设备通道信息ID
     * @return 结果
     */
    @Override
    public int deleteTbDevchnnById(Long id)
    {
        return tbDevchnnMapper.deleteTbDevchnnById(id);
    }
}
