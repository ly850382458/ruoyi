package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TbPollingMapper;
import com.ruoyi.system.domain.TbPolling;
import com.ruoyi.system.service.ITbPollingService;
import com.ruoyi.common.core.text.Convert;

/**
 * 轮巡Service业务层处理
 * 
 * @author ruoyi
 * @date 2019-12-09
 */
@Service
public class TbPollingServiceImpl implements ITbPollingService 
{
    @Autowired
    private TbPollingMapper tbPollingMapper;

    /**
     * 查询轮巡
     * 
     * @param id 轮巡ID
     * @return 轮巡
     */
    @Override
    public TbPolling selectTbPollingById(Long id)
    {
        return tbPollingMapper.selectTbPollingById(id);
    }

    /**
     * 查询轮巡列表
     * 
     * @param tbPolling 轮巡
     * @return 轮巡
     */
    @Override
    public List<TbPolling> selectTbPollingList(TbPolling tbPolling)
    {
        return tbPollingMapper.selectTbPollingList(tbPolling);
    }

    /**
     * 新增轮巡
     * 
     * @param tbPolling 轮巡
     * @return 结果
     */
    @Override
    public int insertTbPolling(TbPolling tbPolling)
    {
        return tbPollingMapper.insertTbPolling(tbPolling);
    }

    /**
     * 修改轮巡
     * 
     * @param tbPolling 轮巡
     * @return 结果
     */
    @Override
    public int updateTbPolling(TbPolling tbPolling)
    {
        return tbPollingMapper.updateTbPolling(tbPolling);
    }

    /**
     * 删除轮巡对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTbPollingByIds(String ids)
    {
        return tbPollingMapper.deleteTbPollingByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除轮巡信息
     * 
     * @param id 轮巡ID
     * @return 结果
     */
    @Override
    public int deleteTbPollingById(Long id)
    {
        return tbPollingMapper.deleteTbPollingById(id);
    }

    /**
     * 查询所有轮巡类型
     * 
     * @return 字典类型集合信息
     */
	@Override
	public List<TbPolling> selectTbPollingAll() {
		
		return tbPollingMapper.selectTbPollingAll();
	}


}
