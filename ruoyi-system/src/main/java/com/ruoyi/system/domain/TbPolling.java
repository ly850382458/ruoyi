package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 轮巡对象 tb_polling
 * 
 * @author ruoyi
 * @date 2019-12-09
 */
public class TbPolling extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 轮巡名称 */
    @Excel(name = "轮巡名称")
    private String name;

    /** 账户ID */
    @Excel(name = "账户ID")
    private Long accountId;

    /** 轮巡间隔 */
    @Excel(name = "轮巡间隔")
    private Long timeInterval;

    /** 分屏模式 */
    @Excel(name = "分屏模式")
    private Long windowsplit;

    /** 不执行轮巡窗口 */
    @Excel(name = "不执行轮巡窗口")
    private String windowexclude;

    /** 是否共享(0表示不共享,1表示共享） */
    @Excel(name = "是否共享(0表示不共享,1表示共享）")
    private Long shareStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setAccountId(Long accountId) 
    {
        this.accountId = accountId;
    }

    public Long getAccountId() 
    {
        return accountId;
    }
    public void setTimeInterval(Long timeInterval) 
    {
        this.timeInterval = timeInterval;
    }

    public Long getTimeInterval() 
    {
        return timeInterval;
    }
    public void setWindowsplit(Long windowsplit) 
    {
        this.windowsplit = windowsplit;
    }

    public Long getWindowsplit() 
    {
        return windowsplit;
    }
    public void setWindowexclude(String windowexclude) 
    {
        this.windowexclude = windowexclude;
    }

    public String getWindowexclude() 
    {
        return windowexclude;
    }
    public void setShareStatus(Long shareStatus) 
    {
        this.shareStatus = shareStatus;
    }

    public Long getShareStatus() 
    {
        return shareStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("accountId", getAccountId())
            .append("timeInterval", getTimeInterval())
            .append("windowsplit", getWindowsplit())
            .append("windowexclude", getWindowexclude())
            .append("remark", getRemark())
            .append("shareStatus", getShareStatus())
            .toString();
    }
}
