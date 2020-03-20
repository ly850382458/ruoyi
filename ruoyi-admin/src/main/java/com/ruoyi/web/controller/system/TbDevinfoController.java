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
import com.ruoyi.system.domain.TbDevinfo;
import com.ruoyi.system.service.ITbDevinfoService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备基本信息Controller
 * 
 * @author ruoyi
 * @date 2019-11-17
 */
@Controller
@RequestMapping("/system/devinfo")
public class TbDevinfoController extends BaseController
{
    private String prefix = "system/devinfo";

    @Autowired
    private ITbDevinfoService tbDevinfoService;

    @RequiresPermissions("system:devinfo:view")
    @GetMapping()
    public String devinfo()
    {
        return prefix + "/devinfo";
    }

    /**
     * 查询设备基本信息列表
     */
    @RequiresPermissions("system:devinfo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbDevinfo tbDevinfo)
    {
        startPage();
        List<TbDevinfo> list = tbDevinfoService.selectTbDevinfoList(tbDevinfo);
        return getDataTable(list);
    }

    /**
     * 导出设备基本信息列表
     */
    @RequiresPermissions("system:devinfo:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbDevinfo tbDevinfo)
    {
        List<TbDevinfo> list = tbDevinfoService.selectTbDevinfoList(tbDevinfo);
        ExcelUtil<TbDevinfo> util = new ExcelUtil<TbDevinfo>(TbDevinfo.class);
        return util.exportExcel(list, "devinfo");
    }

    /**
     * 新增设备基本信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备基本信息
     */
    @RequiresPermissions("system:devinfo:add")
    @Log(title = "设备基本信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbDevinfo tbDevinfo)
    {
        return toAjax(tbDevinfoService.insertTbDevinfo(tbDevinfo));
    }

    /**
     * 修改设备基本信息
     */
    @GetMapping("/edit/{devId}")
    public String edit(@PathVariable("devId") Long devId, ModelMap mmap)
    {
        TbDevinfo tbDevinfo = tbDevinfoService.selectTbDevinfoById(devId);
        mmap.put("tbDevinfo", tbDevinfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备基本信息
     */
    @RequiresPermissions("system:devinfo:edit")
    @Log(title = "设备基本信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbDevinfo tbDevinfo)
    {
        return toAjax(tbDevinfoService.updateTbDevinfo(tbDevinfo));
    }

    /**
     * 删除设备基本信息
     */
    @RequiresPermissions("system:devinfo:remove")
    @Log(title = "设备基本信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbDevinfoService.deleteTbDevinfoByIds(ids));
    }
}
