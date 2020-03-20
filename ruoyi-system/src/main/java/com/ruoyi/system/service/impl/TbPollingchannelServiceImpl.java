package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.system.mapper.TbPollingMapper;
import com.ruoyi.system.mapper.TbPollingchannelMapper;
import com.ruoyi.system.domain.TbPolling;
import com.ruoyi.system.domain.TbPollingchannel;
import com.ruoyi.system.service.ITbPollingchannelService;
import com.ruoyi.common.core.text.Convert;

/**
 * 轮巡通道Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-12-09
 */
@Service
public class TbPollingchannelServiceImpl implements ITbPollingchannelService 
{
    @Autowired
    private TbPollingchannelMapper tbPollingchannelMapper;
    private TbPollingMapper tbPollingMapper;

    /**
     * 查询轮巡通道
     * 
     * @param id 轮巡通道ID
     * @return 轮巡通道
     */
    @Override
    public TbPollingchannel selectTbPollingchannelById(Long id)
    {
        return tbPollingchannelMapper.selectTbPollingchannelById(id);
    }

    /**
     * 查询轮巡通道列表
     * 
     * @param tbPollingchannel 轮巡通道
     * @return 轮巡通道
     */
    @Override
    public List<TbPollingchannel> selectTbPollingchannelList(TbPollingchannel tbPollingchannel)
    {
        return tbPollingchannelMapper.selectTbPollingchannelList(tbPollingchannel);
    }
        
   

    /**
     * 新增轮巡通道
     * 
     * @param tbPollingchannel 轮巡通道
     * @return 结果
     */
    @Override
    public int insertTbPollingchannel(TbPollingchannel tbPollingchannel)
    {
        return tbPollingchannelMapper.insertTbPollingchannel(tbPollingchannel);
    }

    /**
     * 修改轮巡通道
     * 
     * @param tbPollingchannel 轮巡通道
     * @return 结果
     */
    @Override
    public int updateTbPollingchannel(TbPollingchannel tbPollingchannel)
    {
        return tbPollingchannelMapper.updateTbPollingchannel(tbPollingchannel);
    }

    /**
     * 删除轮巡通道对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbPollingchannelByIds(String ids)
    {
        return tbPollingchannelMapper.deleteTbPollingchannelByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除轮巡通道信息
     * 
     * @param id 轮巡通道ID
     * @return 结果
     */
    @Override
    public int deleteTbPollingchannelById(Long id)
    {
        return tbPollingchannelMapper.deleteTbPollingchannelById(id);
    }

	@Override
	public List<TbPollingchannel> selectTbPollingchannelListByPollingId( Long pollingId) {
		// TODO Auto-generated method stub
		return tbPollingchannelMapper.selectTbPollingchannelListByPollingId(pollingId);
	}

    
   


}
