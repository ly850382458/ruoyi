package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备通道信息对象 tb_devchnn
 * 
 * @author ruoyi
 * @date 2019-12-05
 */
public class TbDevchnn extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增长ID */
    private Long id;

    /** 平台ID */
    @Excel(name = "平台ID")
    private Long platformId;
    
    /** 设备登陆密码 */
    @Excel(name = "设备登陆密码")
    private String devUserpwd;
    
    /** 设备连接信息 */
    @Excel(name = "设备连接信息")
    private String devConn;
    
    /** 维护单位 */
    @Excel(name = "维护单位")
    private String whdw;
    
    /** 设备状态 */
    @Excel(name = "设备状态")
    private String  onlineStatusW;
    
    

   

	/** 设备ID */
    @Excel(name = "设备ID")
    private Long devId;

    /** 设备通道ID */
    @Excel(name = "设备通道ID")
    private Long chnId;

    /** 通道类型ID */
    @Excel(name = "通道类型ID")
    private Long chntypeId;

    /** 通道编码 */
    @Excel(name = "通道编码")
    private String chnCode;

    /** 设备通道名称 */
    @Excel(name = "设备通道名称")
    private String chnName;

    /** 国标编码 */
    @Excel(name = "国标编码")
    private String gb28181codeId;

    /** 通道扩展信息 */
    @Excel(name = "通道扩展信息")
    private String chnExtParam;

    /** 1为已删除 0为没有删除 */
    @Excel(name = "1为已删除 0为没有删除")
    private Long isDeleted;

    /** 域ID */
    @Excel(name = "域ID")
    private Long domainId;

    /** 矩阵ID */
    @Excel(name = "矩阵ID")
    private Long matrixId;

    /** 默认码流（1主码流，2辅码流） */
    @Excel(name = "默认码流", readConverterExp = "1=主码流，2辅码流")
    private Long defaultStream;

    /** 外观(0枪机,1球机） */
    @Excel(name = "外观(0枪机,1球机）")
    private Long facade;

    /** 控制类型(0不可控、1完全可控) */
    @Excel(name = "控制类型(0不可控、1完全可控)")
    private Long controlType;

    /** GPS_X */
    @Excel(name = "GPS_X")
    private String gpsX;

    /** GPS_Y */
    @Excel(name = "GPS_Y")
    private String gpsY;

    /** 通道能力集 */
    @Excel(name = "通道能力集")
    private String chnAbility;

    /** 通道名称缩写 */
    @Excel(name = "通道名称缩写")
    private String chnNameAbbr;

    /** 通道名称全拼 */
    @Excel(name = "通道名称全拼")
    private String chnNameSpell;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long versionValue;

    /** 通道IP地址 */
    @Excel(name = "通道IP地址")
    private String chnIpaddr;

    /** 通道排序值 */
    @Excel(name = "通道排序值")
    private Long orderid;

    /** 通道是否展现，1展现，0不展现 */
    @Excel(name = "通道是否展现，1展现，0不展现")
    private Long isShow;

    /** 备注 */
    @Excel(name = "备注")
    private String chnRemark;

    /** 录像默认存储类型（0中心，1前端） */
    @Excel(name = "录像默认存储类型", readConverterExp = "0=中心，1前端")
    private Long storageType;

    /** 用途类型（1普通摄像机、2高点、3人脸、4卡口、5警力终端、6警车） */
    @Excel(name = "用途类型", readConverterExp = "1=普通摄像机、2高点、3人脸、4卡口、5警力终端、6警车")
    private Long usageType;

    /** 可视域信息,格式:起始角度,终止角度,半径距离 */
    @Excel(name = "可视域信息,格式:起始角度,终止角度,半径距离")
    private String viewshed;
    
    /** 是否考核 */
    @Excel(name = "是否考核")
    private String authid;
    
    
    
    public String getAuthid() {
		return authid;
	}

	public void setSfkh(String authid) {
		this.authid = authid;
	}

	public String getWhdw() {
		return whdw;
	}

	public void setWhdw(String whdw) {
		this.whdw = whdw;
	}

	public String getOnlineStatusW() {
		return onlineStatusW;
	}

	public void setOnlineStatusW(String onlineStatusW) {
		this.onlineStatusW = onlineStatusW;
	}

    public String getDevUserpwd() {
		return devUserpwd;
	}

	public void setDevUserpwd(String devUserpwd) {
		this.devUserpwd = devUserpwd;
	}

	public String getDevConn() {
		return devConn;
	}

	public void setDevConn(String devConn) {
		this.devConn = devConn;
	}

	public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPlatformId(Long platformId) 
    {
        this.platformId = platformId;
    }

    public Long getPlatformId() 
    {
        return platformId;
    }
    public void setDevId(Long devId) 
    {
        this.devId = devId;
    }

    public Long getDevId() 
    {
        return devId;
    }
    public void setChnId(Long chnId) 
    {
        this.chnId = chnId;
    }

    public Long getChnId() 
    {
        return chnId;
    }
    public void setChntypeId(Long chntypeId) 
    {
        this.chntypeId = chntypeId;
    }

    public Long getChntypeId() 
    {
        return chntypeId;
    }
    public void setChnCode(String chnCode) 
    {
        this.chnCode = chnCode;
    }

    public String getChnCode() 
    {
        return chnCode;
    }
    public void setChnName(String chnName) 
    {
        this.chnName = chnName;
    }

    public String getChnName() 
    {
        return chnName;
    }
    public void setGb28181codeId(String gb28181codeId) 
    {
        this.gb28181codeId = gb28181codeId;
    }

    public String getGb28181codeId() 
    {
        return gb28181codeId;
    }
    public void setChnExtParam(String chnExtParam) 
    {
        this.chnExtParam = chnExtParam;
    }

    public String getChnExtParam() 
    {
        return chnExtParam;
    }
    public void setIsDeleted(Long isDeleted) 
    {
        this.isDeleted = isDeleted;
    }

    public Long getIsDeleted() 
    {
        return isDeleted;
    }
    public void setDomainId(Long domainId) 
    {
        this.domainId = domainId;
    }

    public Long getDomainId() 
    {
        return domainId;
    }
    public void setMatrixId(Long matrixId) 
    {
        this.matrixId = matrixId;
    }

    public Long getMatrixId() 
    {
        return matrixId;
    }
    public void setDefaultStream(Long defaultStream) 
    {
        this.defaultStream = defaultStream;
    }

    public Long getDefaultStream() 
    {
        return defaultStream;
    }
    public void setFacade(Long facade) 
    {
        this.facade = facade;
    }

    public Long getFacade() 
    {
        return facade;
    }
    public void setControlType(Long controlType) 
    {
        this.controlType = controlType;
    }

    public Long getControlType() 
    {
        return controlType;
    }
    public void setGpsX(String gpsX) 
    {
        this.gpsX = gpsX;
    }

    public String getGpsX() 
    {
        return gpsX;
    }
    public void setGpsY(String gpsY) 
    {
        this.gpsY = gpsY;
    }

    public String getGpsY() 
    {
        return gpsY;
    }
    public void setChnAbility(String chnAbility) 
    {
        this.chnAbility = chnAbility;
    }

    public String getChnAbility() 
    {
        return chnAbility;
    }
    public void setChnNameAbbr(String chnNameAbbr) 
    {
        this.chnNameAbbr = chnNameAbbr;
    }

    public String getChnNameAbbr() 
    {
        return chnNameAbbr;
    }
    public void setChnNameSpell(String chnNameSpell) 
    {
        this.chnNameSpell = chnNameSpell;
    }

    public String getChnNameSpell() 
    {
        return chnNameSpell;
    }
    public void setVersionValue(Long versionValue) 
    {
        this.versionValue = versionValue;
    }

    public Long getVersionValue() 
    {
        return versionValue;
    }
    public void setChnIpaddr(String chnIpaddr) 
    {
        this.chnIpaddr = chnIpaddr;
    }

    public String getChnIpaddr() 
    {
        return chnIpaddr;
    }
    public void setOrderid(Long orderid) 
    {
        this.orderid = orderid;
    }

    public Long getOrderid() 
    {
        return orderid;
    }
    public void setIsShow(Long isShow) 
    {
        this.isShow = isShow;
    }

    public Long getIsShow() 
    {
        return isShow;
    }
    public void setChnRemark(String chnRemark) 
    {
        this.chnRemark = chnRemark;
    }

    public String getChnRemark() 
    {
        return chnRemark;
    }
    public void setStorageType(Long storageType) 
    {
        this.storageType = storageType;
    }

    public Long getStorageType() 
    {
        return storageType;
    }
    public void setUsageType(Long usageType) 
    {
        this.usageType = usageType;
    }

    public Long getUsageType() 
    {
        return usageType;
    }
    public void setViewshed(String viewshed) 
    {
        this.viewshed = viewshed;
    }

    public String getViewshed() 
    {
        return viewshed;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("platformId", getPlatformId())
            .append("devId", getDevId())
            .append("chnId", getChnId())
            .append("chntypeId", getChntypeId())
            .append("chnCode", getChnCode())
            .append("chnName", getChnName())
            .append("gb28181codeId", getGb28181codeId())
            .append("chnExtParam", getChnExtParam())
            .append("isDeleted", getIsDeleted())
            .append("domainId", getDomainId())
            .append("matrixId", getMatrixId())
            .append("defaultStream", getDefaultStream())
            .append("facade", getFacade())
            .append("controlType", getControlType())
            .append("gpsX", getGpsX())
            .append("gpsY", getGpsY())
            .append("chnAbility", getChnAbility())
            .append("chnNameAbbr", getChnNameAbbr())
            .append("chnNameSpell", getChnNameSpell())
            .append("versionValue", getVersionValue())
            .append("updateTime", getUpdateTime())
            .append("chnIpaddr", getChnIpaddr())
            .append("orderid", getOrderid())
            .append("isShow", getIsShow())
            .append("chnRemark", getChnRemark())
            .append("storageType", getStorageType())
            .append("usageType", getUsageType())
            .append("viewshed", getViewshed())
            .toString();
    }
}
