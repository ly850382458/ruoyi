package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 登录日志对象 tb_jou_login
 * 
 * @author ruoyi
 * @date 2019-11-07
 */
public class TbJouLogin extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 自增长ID */
    private Long id;

    /** 发生时间 */
    @Excel(name = "发生时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date hpTm;

    /** 用户名 */
    @Excel(name = "用户名")
    private String operId;

    /** 客户端IP */
    @Excel(name = "客户端IP")
    private String userHostname;

    /** 登陆操作类型 */
    @Excel(name = "登陆操作类型")
    private String content;

    /** 登陆结果 */
    @Excel(name = "登陆结果")
    private Long result;

    /** 操作描述 */
    @Excel(name = "操作描述")
    private String descri;

    /** 失败原因 */
    @Excel(name = "失败原因")
    private String error;
    
    /** 账号信息表 */
    @Excel(name = "账号信息表")
    private TbV2User tbV2User;
    
    /** 用户姓名 */
    @Excel(name = "用户姓名")
    private String username;
    
    /** 帐号名称 */
    @Excel(name = "帐号名称")
    private String accountname;

   

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccountname() {
		return accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public TbV2User getTbV2User() {
		return tbV2User;
	}

	public void setTbV2User(TbV2User tbV2User) {
		this.tbV2User = tbV2User;
	}

	public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setHpTm(Date hpTm) 
    {
        this.hpTm = hpTm;
    }

    public Date getHpTm() 
    {
        return hpTm;
    }
    public void setOperId(String operId) 
    {
        this.operId = operId;
    }

    public String getOperId() 
    {
        return operId;
    }
    public void setUserHostname(String userHostname) 
    {
        this.userHostname = userHostname;
    }

    public String getUserHostname() 
    {
        return userHostname;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setResult(Long result) 
    {
        this.result = result;
    }

    public Long getResult() 
    {
        return result;
    }
    public void setDescri(String descri) 
    {
        this.descri = descri;
    }

    public String getDescri() 
    {
        return descri;
    }
    public void setError(String error) 
    {
        this.error = error;
    }

    public String getError() 
    {
        return error;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("hpTm", getHpTm())
            .append("operId", getOperId())
            .append("userHostname", getUserHostname())
            .append("content", getContent())
            .append("result", getResult())
            .append("descri", getDescri())
            .append("error", getError())
            .toString();
    }
}
