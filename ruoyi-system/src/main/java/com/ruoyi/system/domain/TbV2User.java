package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 帐号信息对象 tb_v2_user
 * 
 * @author ruoyi
 * @date 2019-11-10
 */
public class TbV2User extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 帐号ID */
    private Long accountid;

    /** 帐号名称 */
    @Excel(name = "帐号名称")
    private String accountname;

    /** 帐号密码 */
    @Excel(name = "帐号密码")
    private String password;

    /** 用户姓名 */
    @Excel(name = "用户姓名")
    private String username;

    /** 用户编码 */
    @Excel(name = "用户编码")
    private String usercode;

    /** 性别 */
    @Excel(name = "性别")
    private Long gender;

    /** 身份证 */
    @Excel(name = "身份证")
    private String idcard;

    /** 所属组织ID */
    @Excel(name = "所属组织ID")
    private Long organizeid;

    /** 警号 */
    @Excel(name = "警号")
    private String policeid;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String contact;

    /** 数字证书登录 */
    @Excel(name = "数字证书登录")
    private Long digitallogin;

    /** 用户优先级 */
    @Excel(name = "用户优先级")
    private Long priority;

    /** 是否使用 */
    @Excel(name = "是否使用")
    private Long enable;

    /** 1表示允许重复登陆
            0表示禁止重复登陆 */
    @Excel(name = "1表示允许重复登陆 0表示禁止重复登陆")
    private Long repeatlogin;

    /** 1为已删除 0为没有删除 */
    @Excel(name = "1为已删除 0为没有删除")
    private Long isDeleted;

    /** 1为在线0为离线 */
    @Excel(name = "1为在线0为离线")
    private Long loginStatus;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createuser;

    public void setAccountid(Long accountid) 
    {
        this.accountid = accountid;
    }

    public Long getAccountid() 
    {
        return accountid;
    }
    public void setAccountname(String accountname) 
    {
        this.accountname = accountname;
    }

    public String getAccountname() 
    {
        return accountname;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }
    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getUsername() 
    {
        return username;
    }
    public void setUsercode(String usercode) 
    {
        this.usercode = usercode;
    }

    public String getUsercode() 
    {
        return usercode;
    }
    public void setGender(Long gender) 
    {
        this.gender = gender;
    }

    public Long getGender() 
    {
        return gender;
    }
    public void setIdcard(String idcard) 
    {
        this.idcard = idcard;
    }

    public String getIdcard() 
    {
        return idcard;
    }
    public void setOrganizeid(Long organizeid) 
    {
        this.organizeid = organizeid;
    }

    public Long getOrganizeid() 
    {
        return organizeid;
    }
    public void setPoliceid(String policeid) 
    {
        this.policeid = policeid;
    }

    public String getPoliceid() 
    {
        return policeid;
    }
    public void setContact(String contact) 
    {
        this.contact = contact;
    }

    public String getContact() 
    {
        return contact;
    }
    public void setDigitallogin(Long digitallogin) 
    {
        this.digitallogin = digitallogin;
    }

    public Long getDigitallogin() 
    {
        return digitallogin;
    }
    public void setPriority(Long priority) 
    {
        this.priority = priority;
    }

    public Long getPriority() 
    {
        return priority;
    }
    public void setEnable(Long enable) 
    {
        this.enable = enable;
    }

    public Long getEnable() 
    {
        return enable;
    }
    public void setRepeatlogin(Long repeatlogin) 
    {
        this.repeatlogin = repeatlogin;
    }

    public Long getRepeatlogin() 
    {
        return repeatlogin;
    }
    public void setIsDeleted(Long isDeleted) 
    {
        this.isDeleted = isDeleted;
    }

    public Long getIsDeleted() 
    {
        return isDeleted;
    }
    public void setLoginStatus(Long loginStatus) 
    {
        this.loginStatus = loginStatus;
    }

    public Long getLoginStatus() 
    {
        return loginStatus;
    }
    public void setCreateuser(String createuser) 
    {
        this.createuser = createuser;
    }

    public String getCreateuser() 
    {
        return createuser;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("accountid", getAccountid())
            .append("accountname", getAccountname())
            .append("password", getPassword())
            .append("username", getUsername())
            .append("usercode", getUsercode())
            .append("gender", getGender())
            .append("idcard", getIdcard())
            .append("organizeid", getOrganizeid())
            .append("policeid", getPoliceid())
            .append("contact", getContact())
            .append("remark", getRemark())
            .append("digitallogin", getDigitallogin())
            .append("priority", getPriority())
            .append("enable", getEnable())
            .append("repeatlogin", getRepeatlogin())
            .append("isDeleted", getIsDeleted())
            .append("loginStatus", getLoginStatus())
            .append("createuser", getCreateuser())
            .append("createtime", getCreateTime())
            .toString();
    }
}
