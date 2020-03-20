package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.TbDevinfo;
import java.util.List;

/**
 * 设备基本信息Mapper接口
 * 
 * @author ruoyi
 * @date 2019-11-17
 */
public interface TbDevinfoMapper 
{
    /**
     * 查询设备基本信息
     * 
     * @param devId 设备基本信息ID
     * @return 设备基本信息
     */
    public TbDevinfo selectTbDevinfoById(Long devId);

    /**
     * 查询设备基本信息列表
     * 
     * @param tbDevinfo 设备基本信息
     * @return 设备基本信息集合
     */
    public List<TbDevinfo> selectTbDevinfoList(TbDevinfo tbDevinfo);

    /**
     * 新增设备基本信息
     * 
     * @param tbDevinfo 设备基本信息
     * @return 结果
     */
    public int insertTbDevinfo(TbDevinfo tbDevinfo);

    /**
     * 修改设备基本信息
     * 
     * @param tbDevinfo 设备基本信息
     * @return 结果
     */
    public int updateTbDevinfo(TbDevinfo tbDevinfo);

    /**
     * 删除设备基本信息
     * 
     * @param devId 设备基本信息ID
     * @return 结果
     */
    public int deleteTbDevinfoById(Long devId);

    /**
     * 批量删除设备基本信息
     * 
     * @param devIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbDevinfoByIds(String[] devIds);
}
