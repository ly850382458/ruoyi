package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.TbPolling;
import com.ruoyi.system.domain.TbPollingchannel;
import java.util.List;

/**
 * 轮巡通道Mapper接口
 * 
 * @author ruoyi
 * @date 2019-12-09
 */
public interface TbPollingchannelMapper 
{
    /**
     * 查询轮巡通道
     * 
     * @param id 轮巡通道ID
     * @return 轮巡通道
     */
    public TbPollingchannel selectTbPollingchannelById(Long id);

    /**
            * 查询轮巡通道列表
     * 
     * @param tbPollingchannel 轮巡通道
     * @return 轮巡通道集合
     */
    public List<TbPollingchannel> selectTbPollingchannelList(TbPollingchannel tbPollingchannel);
    
    
    /**
            * 查询轮巡通道列表根据pollingId
     * 
	 * @param tbPollingchannel 轮巡通道
	 * @return 轮巡通道集合
	 */
    public List<TbPollingchannel> selectTbPollingchannelListByPollingId(Long pollingId);

    /**
     * 新增轮巡通道
     * 
     * @param tbPollingchannel 轮巡通道
     * @return 结果
     */
    public int insertTbPollingchannel(TbPollingchannel tbPollingchannel);

    /**
     * 修改轮巡通道
     * 
     * @param tbPollingchannel 轮巡通道
     * @return 结果
     */
    public int updateTbPollingchannel(TbPollingchannel tbPollingchannel);

    /**
     * 删除轮巡通道
     * 
     * @param id 轮巡通道ID
     * @return 结果
     */
    public int deleteTbPollingchannelById(Long id);

    /**
     * 批量删除轮巡通道
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbPollingchannelByIds(String[] ids);
    
   
    
 
}
