package com.ruoyi.web.controller.system;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
import com.ruoyi.system.domain.TbDevchnn;
import com.ruoyi.system.service.ITbDevchnnService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 设备通道信息Controller
 * 
 * @author ruoyi
 * @date 2019-12-05
 */
@Controller
@RequestMapping("/system/devchnn")
public class TbDevchnnController extends BaseController
{
    private String prefix = "system/devchnn";

    @Autowired
    private ITbDevchnnService tbDevchnnService;

    @RequiresPermissions("system:devchnn:view")
    @GetMapping()
    public String devchnn()
    {
        return prefix + "/devchnn";
    }

    /**
     * 查询设备通道信息列表
     */
    @RequiresPermissions("system:devchnn:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbDevchnn tbDevchnn,HttpServletRequest request)
    {
        startPage();
        String s = request.getParameter("sfkh");
        System.out.println("是否考核*********"+s);
        
        List<TbDevchnn> list = tbDevchnnService.selectTbDevchnnList(tbDevchnn);
        return getDataTable(list);
    }

    /**
     * 导出设备通道信息列表
     */
    @RequiresPermissions("system:devchnn:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbDevchnn tbDevchnn)
    {
        List<TbDevchnn> list = tbDevchnnService.selectTbDevchnnList(tbDevchnn);
        ExcelUtil<TbDevchnn> util = new ExcelUtil<TbDevchnn>(TbDevchnn.class);
        return util.exportExcel(list, "devchnn");
    }

    /**
     * 新增设备通道信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存设备通道信息
     */
    @RequiresPermissions("system:devchnn:add")
    @Log(title = "设备通道信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbDevchnn tbDevchnn)
    {
        return toAjax(tbDevchnnService.insertTbDevchnn(tbDevchnn));
    }

    /**
     * 修改设备通道信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbDevchnn tbDevchnn = tbDevchnnService.selectTbDevchnnById(id);
        mmap.put("tbDevchnn", tbDevchnn);
        return prefix + "/edit";
    }

    /**
     * 修改保存设备通道信息
     */
    @RequiresPermissions("system:devchnn:edit")
    @Log(title = "设备通道信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbDevchnn tbDevchnn)
    {
        return toAjax(tbDevchnnService.updateTbDevchnn(tbDevchnn));
    }

    /**
     * 删除设备通道信息
     */
    @RequiresPermissions("system:devchnn:remove")
    @Log(title = "设备通道信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbDevchnnService.deleteTbDevchnnByIds(ids));
    }
}
