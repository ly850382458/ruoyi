package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TbPollingchannel;
import com.ruoyi.system.service.ITbPollingService;
import com.ruoyi.system.service.ITbPollingchannelService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 轮巡通道Controller
 * 
 * @author ruoyi
 * @date 2019-12-09
 */
@Controller
@RequestMapping("/system/pollingchannel")
public class TbPollingchannelController extends BaseController
{
    private String prefix = "system/pollingchannel";

    @Autowired
    private ITbPollingchannelService tbPollingchannelService;
    @Autowired
    private ITbPollingService tbPollingService;

    @RequiresPermissions("system:pollingchannel:view")
    @GetMapping()
    public String pollingchannel(ModelMap mmap)
    {
    	mmap.put("pollingList", tbPollingService.selectTbPollingAll());
        return prefix + "/pollingchannel";
    }
    


    /**
            * 查询轮巡通道列表
     */
    @RequiresPermissions("system:pollingchannel:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbPollingchannel tbPollingchannel)
    {
        startPage();
        List<TbPollingchannel> list = tbPollingchannelService.selectTbPollingchannelList(tbPollingchannel);
        return getDataTable(list);
    }

    /**
     * 导出轮巡通道列表
     */
    @RequiresPermissions("system:pollingchannel:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbPollingchannel tbPollingchannel)
    {
        List<TbPollingchannel> list = tbPollingchannelService.selectTbPollingchannelList(tbPollingchannel);
        ExcelUtil<TbPollingchannel> util = new ExcelUtil<TbPollingchannel>(TbPollingchannel.class);
        return util.exportExcel(list, "pollingchannel");
    }

    /**
     * 新增轮巡通道
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存轮巡通道
     */
    @RequiresPermissions("system:pollingchannel:add")
    @Log(title = "轮巡通道", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbPollingchannel tbPollingchannel)
    {
        return toAjax(tbPollingchannelService.insertTbPollingchannel(tbPollingchannel));
    }

    /**
     * 修改轮巡通道
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbPollingchannel tbPollingchannel = tbPollingchannelService.selectTbPollingchannelById(id);
        mmap.put("tbPollingchannel", tbPollingchannel);
        return prefix + "/edit";
    }

    /**
     * 修改保存轮巡通道
     */
    @RequiresPermissions("system:pollingchannel:edit")
    @Log(title = "轮巡通道", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbPollingchannel tbPollingchannel)
    {
        return toAjax(tbPollingchannelService.updateTbPollingchannel(tbPollingchannel));
    }

    /**
     * 删除轮巡通道
     */
    @RequiresPermissions("system:pollingchannel:remove")
    @Log(title = "轮巡通道", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbPollingchannelService.deleteTbPollingchannelByIds(ids));
    }
}
