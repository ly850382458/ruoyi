package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 轮巡通道对象 tb_pollingchannel
 * 
 * @author ruoyi
 * @date 2019-12-09
 */
public class TbPollingchannel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 所属轮巡ID */
    @Excel(name = "所属轮巡ID")
    private Long pollingId;

    /** 通道物理ID */
    @Excel(name = "通道物理ID")
    private Long chnId;
    
    /** 点位名称 */
    @Excel(name = "点位名称")
    private String  chnName;

    /** 顺序 */
    @Excel(name = "顺序")
    private Long orderIndex;

    /** 码流类型（1：主码流，2：辅码流） */
    @Excel(name = "码流类型", readConverterExp = "1=：主码流，2：辅码流")
    private Long streamType;
    


    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPollingId(Long pollingId) 
    {
        this.pollingId = pollingId;
    }

    public Long getPollingId() 
    {
        return pollingId;
    }
    public void setChnId(Long chnId) 
    {
        this.chnId = chnId;
    }

    public Long getChnId() 
    {
        return chnId;
    }
    
    public String getChnName() {
		return chnName;
	}

	public void setChnName(String chnName) {
		this.chnName = chnName;
	}

	public void setOrderIndex(Long orderIndex) 
    {
        this.orderIndex = orderIndex;
    }

    public Long getOrderIndex() 
    {
        return orderIndex;
    }
    public void setStreamType(Long streamType) 
    {
        this.streamType = streamType;
    }

    public Long getStreamType() 
    {
        return streamType;
    }
    
    



	@Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("pollingId", getPollingId())
            .append("chnId", getChnId())
            .append("orderIndex", getOrderIndex())
            .append("streamType", getStreamType())
            .toString();
    }
	
	
	
}
