package com.ruoyi.web.controller.wms;


import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.framework.web.service.PermissionService;
import com.ruoyi.wms.domain.EquipmentInfo;
import com.ruoyi.wms.service.impl.EquipmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@Anonymous
@RequestMapping("/wms/buildEms")
public class EquipmentInfoController extends BaseController {

    @Autowired
    private EquipmentInfoService service;
    @Autowired
    private PermissionService ss;

    @GetMapping("/list")
    public TableDataInfo getEquipmentInfos(EquipmentInfo info) {
        startPage();
        List<EquipmentInfo> equipmentInfos = service.getEquipmentInfos(info);
        return getDataTable(equipmentInfos);
    }

    @PostMapping("/add")
    public AjaxResult addEquipment(@Validated @RequestBody EquipmentInfo info) {
        int i = service.insertEquipmentInfo(info);
        AjaxResult ajaxResult = toAjax(i);
        return ajaxResult;
    }

    @PutMapping("/modify")
    public AjaxResult modifyEquipment(@Validated @RequestBody EquipmentInfo info){
        int i = service.modifyEquipmentInfo(info);
        AjaxResult ajaxResult = toAjax(i);
        return ajaxResult;
    }


    @DeleteMapping("/delete/{equipmentIds}")
    public AjaxResult deleteIds(@PathVariable Long[] equipmentIds){
        int rows= service.deleteEquipmentByIds(equipmentIds);
        return toAjax(rows);
    }







}
