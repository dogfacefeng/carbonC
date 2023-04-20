package com.ruoyi.web.controller.wms;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.constant.HttpStatus;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.wms.domain.WareHouseInfo;
import com.ruoyi.wms.service.impl.WareHouseInfoService;
import com.ruoyi.wms.validInterface.addValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Anonymous
@RequestMapping("/ems/warehouse")
public class WareHouseInfoController  extends BaseController {

    @Autowired
    private WareHouseInfoService service;

    @GetMapping("list")
    public TableDataInfo getWareHouseInfo(WareHouseInfo info){
        startPage();
        List<WareHouseInfo> wareHouseInfoByCodeOrName = service.getWareHouseInfoByCodeOrName(info);
        return  getDataTable(wareHouseInfoByCodeOrName);
    }


    @PostMapping("/add")
    public AjaxResult addWarehouseInfo(@Validated(addValidator.class) @RequestBody WareHouseInfo info){
        int i = service.insertWareHouseInfo(info);
        AjaxResult ajaxResult = toAjax(i);
        return ajaxResult;
    }

    @PutMapping("/modify")
    public AjaxResult modifyWarehouseInfo(@RequestBody WareHouseInfo info){
        Assert.notNull(info.getId(),"请输入仓库信息主键");
        int i = service.modifyWareHouseInfo(info);
        AjaxResult ajaxResult = toAjax(i);
        return ajaxResult;
    }

    @DeleteMapping("/delete/{wareHouseIds}")
    public AjaxResult deleteWarehouseInfos(@PathVariable Long[] wareHouseIds){
        Assert.notEmpty(wareHouseIds,"请输入需要删除的仓库信息主键");
        int i = service.deleteWareHouseInfos(wareHouseIds);
        if(0==i){
            throw new ServiceException("仓库不存在", HttpStatus.BAD_REQUEST);
        }
        return toAjax(i);
    }



}
