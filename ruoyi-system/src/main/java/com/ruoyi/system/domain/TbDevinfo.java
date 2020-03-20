package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 设备基本信息对象 tb_devinfo
 * 
 * @author ruoyi
 * @date 2019-11-17
 */
public class TbDevinfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 设备ID */
    private Long devId;

    /** 设备名称 */
    @Excel(name = "设备名称")
    private String devName;

    /** 平台ID */
    @Excel(name = "平台ID")
    private Long platformId;

    /** 所属域ID */
    @Excel(name = "所属域ID")
    private Long domainId;

    /** 设备型号ID */
    @Excel(name = "设备型号ID")
    private Long modelId;

    /** 设备门类ID */
    @Excel(name = "设备门类ID")
    private Long categoryId;

    /** 设备连接信息 */
    @Excel(name = "设备连接信息")
    private String devConn;

    /** 设备配置版本号 */
    @Excel(name = "设备配置版本号")
    private String devVersion;

    /** 设备登陆密码 */
    @Excel(name = "设备登陆密码")
    private String devUserpwd;

    /** 设备登陆用户名 */
    @Excel(name = "设备登陆用户名")
    private String devUsername;

    /** 设备编号 */
    @Excel(name = "设备编号")
    private String devCode;

    /** 设备扩展信息 */
    @Excel(name = "设备扩展信息")
    private String devExtParam;

    /** 1为已删除 0为没有删除 */
    @Excel(name = "1为已删除 0为没有删除")
    private Long isDeleted;

    /** 国标编码 */
    @Excel(name = "国标编码")
    private String gb28181codeId;

    /** 设备名称缩写 */
    @Excel(name = "设备名称缩写")
    private String devNameAbbr;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long versionValue;

    /** 备注 */
    @Excel(name = "备注")
    private String devRemark;

    public void setDevId(Long devId) 
    {
        this.devId = devId;
    }

    public Long getDevId() 
    {
        return devId;
    }
    public void setDevName(String devName) 
    {
        this.devName = devName;
    }

    public String getDevName() 
    {
        return devName;
    }
    public void setPlatformId(Long platformId) 
    {
        this.platformId = platformId;
    }

    public Long getPlatformId() 
    {
        return platformId;
    }
    public void setDomainId(Long domainId) 
    {
        this.domainId = domainId;
    }

    public Long getDomainId() 
    {
        return domainId;
    }
    public void setModelId(Long modelId) 
    {
        this.modelId = modelId;
    }

    public Long getModelId() 
    {
        return modelId;
    }
    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }
    public void setDevConn(String devConn) 
    {
        this.devConn = devConn;
    }

    public String getDevConn() 
    {
        return devConn;
    }
    public void setDevVersion(String devVersion) 
    {
        this.devVersion = devVersion;
    }

    public String getDevVersion() 
    {
        return devVersion;
    }
    public void setDevUserpwd(String devUserpwd) 
    {
        this.devUserpwd = devUserpwd;
    }

    public String getDevUserpwd() 
    {
        return devUserpwd;
    }
    public void setDevUsername(String devUsername) 
    {
        this.devUsername = devUsername;
    }

    public String getDevUsername() 
    {
        return devUsername;
    }
    public void setDevCode(String devCode) 
    {
        this.devCode = devCode;
    }

    public String getDevCode() 
    {
        return devCode;
    }
    public void setDevExtParam(String devExtParam) 
    {
        this.devExtParam = devExtParam;
    }

    public String getDevExtParam() 
    {
        return devExtParam;
    }
    public void setIsDeleted(Long isDeleted) 
    {
        this.isDeleted = isDeleted;
    }

    public Long getIsDeleted() 
    {
        return isDeleted;
    }
    public void setGb28181codeId(String gb28181codeId) 
    {
        this.gb28181codeId = gb28181codeId;
    }

    public String getGb28181codeId() 
    {
        return gb28181codeId;
    }
    public void setDevNameAbbr(String devNameAbbr) 
    {
        this.devNameAbbr = devNameAbbr;
    }

    public String getDevNameAbbr() 
    {
        return devNameAbbr;
    }
    public void setVersionValue(Long versionValue) 
    {
        this.versionValue = versionValue;
    }

    public Long getVersionValue() 
    {
        return versionValue;
    }
    public void setDevRemark(String devRemark) 
    {
        this.devRemark = devRemark;
    }

    public String getDevRemark() 
    {
        return devRemark;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("devId", getDevId())
            .append("devName", getDevName())
            .append("platformId", getPlatformId())
            .append("domainId", getDomainId())
            .append("modelId", getModelId())
            .append("categoryId", getCategoryId())
            .append("devConn", getDevConn())
            .append("devVersion", getDevVersion())
            .append("devUserpwd", getDevUserpwd())
            .append("devUsername", getDevUsername())
            .append("devCode", getDevCode())
            .append("devExtParam", getDevExtParam())
            .append("isDeleted", getIsDeleted())
            .append("gb28181codeId", getGb28181codeId())
            .append("devNameAbbr", getDevNameAbbr())
            .append("versionValue", getVersionValue())
            .append("updateTime", getUpdateTime())
            .append("devRemark", getDevRemark())
            .toString();
    }
}
