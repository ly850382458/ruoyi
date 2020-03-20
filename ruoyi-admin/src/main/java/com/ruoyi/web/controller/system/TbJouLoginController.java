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
import com.ruoyi.system.domain.TbJouLogin;
import com.ruoyi.system.service.ITbJouLoginService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 登录日志Controller
 * 
 * @author ruoyi
 * @date 2019-11-07
 */
@Controller
@RequestMapping("/system/login")
public class TbJouLoginController extends BaseController
{
    private String prefix = "system/login";

    @Autowired
    private ITbJouLoginService tbJouLoginService;

    @RequiresPermissions("system:login:view")
    @GetMapping()
    public String login()
    {
        return prefix + "/login";
    }

    /**
     * 查询登录日志列表
     */
    @RequiresPermissions("system:login:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TbJouLogin tbJouLogin)
    {
        startPage(); 
        List<TbJouLogin> list = tbJouLoginService.selectTbJouLoginList(tbJouLogin);
        return getDataTable(list);
    }

    /**
     * 导出登录日志列表
     */
    @RequiresPermissions("system:login:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TbJouLogin tbJouLogin)
    {
        List<TbJouLogin> list = tbJouLoginService.selectTbJouLoginList(tbJouLogin);
        ExcelUtil<TbJouLogin> util = new ExcelUtil<TbJouLogin>(TbJouLogin.class);
        System.out.println("**********************"+util);
        return util.exportExcel(list, "login");
    }

    /**
     * 新增登录日志
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存登录日志
     */
    @RequiresPermissions("system:login:add")
    @Log(title = "登录日志", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TbJouLogin tbJouLogin)
    {
        return toAjax(tbJouLoginService.insertTbJouLogin(tbJouLogin));
    }

    /**
     * 修改登录日志
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TbJouLogin tbJouLogin = tbJouLoginService.selectTbJouLoginById(id);
        mmap.put("tbJouLogin", tbJouLogin);
        return prefix + "/edit";
    }

    /**
     * 修改保存登录日志
     */
    @RequiresPermissions("system:login:edit")
    @Log(title = "登录日志", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TbJouLogin tbJouLogin)
    {
        return toAjax(tbJouLoginService.updateTbJouLogin(tbJouLogin));
    }

    /**
     * 删除登录日志
     */
    @RequiresPermissions("system:login:remove")
    @Log(title = "登录日志", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(tbJouLoginService.deleteTbJouLoginByIds(ids));
    }
}
