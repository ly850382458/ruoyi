package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.TbDevchnn;
import java.util.List;

/**
 * 设备通道信息Mapper接口
 * 
 * @author ruoyi
 * @date 2019-12-05
 */
public interface TbDevchnnMapper 
{
    /**
     * 查询设备通道信息
     * 
     * @param id 设备通道信息ID
     * @return 设备通道信息
     */
    public TbDevchnn selectTbDevchnnById(Long id);

    /**
     * 查询设备通道信息列表
     * 
     * @param tbDevchnn 设备通道信息
     * @return 设备通道信息集合
     */
    public List<TbDevchnn> selectTbDevchnnList(TbDevchnn tbDevchnn);

    /**
     * 新增设备通道信息
     * 
     * @param tbDevchnn 设备通道信息
     * @return 结果
     */
    public int insertTbDevchnn(TbDevchnn tbDevchnn);

    /**
     * 修改设备通道信息
     * 
     * @param tbDevchnn 设备通道信息
     * @return 结果
     */
    public int updateTbDevchnn(TbDevchnn tbDevchnn);

    /**
     * 删除设备通道信息
     * 
     * @param id 设备通道信息ID
     * @return 结果
     */
    public int deleteTbDevchnnById(Long id);

    /**
     * 批量删除设备通道信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbDevchnnByIds(String[] ids);
}
