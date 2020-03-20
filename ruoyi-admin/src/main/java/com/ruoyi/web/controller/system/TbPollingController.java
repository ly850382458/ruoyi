package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TbPolling;
import com.ruoyi.system.service.ITbPollingService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 轮巡Controller
 * 
 * @author ruoyi
 * @date 2019-12-09
 */
@Controller
@RequestMapping("/system/polling")
public class TbPollingController extends BaseController
{
    private String prefix = "system/polling";

    @Autowired
    private ITbPollingService tbPollingService;

    @RequiresPermissions("system:polling:view")
    @GetMapping()
    public String polling()
    {
        return prefix + "/polling";
    }

    /**
     * 查询轮巡列表
     */
    @RequiresPermissions("system:polling:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbPolling tbPolling)
    {
        startPage();
        List<TbPolling> list = tbPollingService.selectTbPollingList(tbPolling);
        return getDataTable(list);
    }

    /**
     * 导出轮巡列表
     */
    @RequiresPermissions("system:polling:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbPolling tbPolling)
    {
        List<TbPolling> list = tbPollingService.selectTbPollingList(tbPolling);
        ExcelUtil<TbPolling> util = new ExcelUtil<TbPolling>(TbPolling.class);
        return util.exportExcel(list, "polling");
    }

    /**
     * 新增轮巡
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存轮巡
     */
    @RequiresPermissions("system:polling:add")
    @Log(title = "轮巡", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbPolling tbPolling)
    {
        return toAjax(tbPollingService.insertTbPolling(tbPolling));
    }

    /**
     * 修改轮巡
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbPolling tbPolling = tbPollingService.selectTbPollingById(id);
        mmap.put("tbPolling", tbPolling);
        return prefix + "/edit";
    }

    /**
     * 修改保存轮巡
     */
    @RequiresPermissions("system:polling:edit")
    @Log(title = "轮巡", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbPolling tbPolling)
    {
        return toAjax(tbPollingService.updateTbPolling(tbPolling));
    }

    /**
     * 删除轮巡
     */
    @RequiresPermissions("system:polling:remove")
    @Log(title = "轮巡", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbPollingService.deleteTbPollingByIds(ids));
    }
}
