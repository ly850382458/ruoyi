package com.ruoyi.system.service;

import com.ruoyi.system.domain.TbPolling;
import java.util.List;

/**
 * 轮巡Service接口
 * 
 * @author ruoyi
 * @date 2019-12-09
 */
public interface ITbPollingService 
{
    /**
     * 查询轮巡
     * 
     * @param id 轮巡ID
     * @return 轮巡
     */
    public TbPolling selectTbPollingById(Long id);

    /**
     * 查询轮巡列表
     * 
     * @param tbPolling 轮巡
     * @return 轮巡集合
     */
    public List<TbPolling> selectTbPollingList(TbPolling tbPolling);

    /**
     * 新增轮巡
     * 
     * @param tbPolling 轮巡
     * @return 结果
     */
    public int insertTbPolling(TbPolling tbPolling);

    /**
     * 修改轮巡
     * 
     * @param tbPolling 轮巡
     * @return 结果
     */
    public int updateTbPolling(TbPolling tbPolling);

    /**
     * 批量删除轮巡
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTbPollingByIds(String ids);

    /**
     * 删除轮巡信息
     * 
     * @param id 轮巡ID
     * @return 结果
     */
    public int deleteTbPollingById(Long id);
    
    /**
     * 查询所有轮巡类型
     * 
     * @return 字典类型集合信息
     */
    public List<TbPolling> selectTbPollingAll();
    

}
