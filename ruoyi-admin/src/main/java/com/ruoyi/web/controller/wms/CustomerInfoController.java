package com.ruoyi.web.controller.wms;

import com.ruoyi.common.annotation.Anonymous;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.wms.domain.CustomerInfo;
import com.ruoyi.wms.service.impl.CustomerInfoService;
import com.ruoyi.wms.validInterface.addValidator;
import com.ruoyi.wms.validInterface.modifyValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Anonymous
@RestController
@RequestMapping("/scm/customer")
public class CustomerInfoController extends BaseController {

    @Autowired
    private CustomerInfoService service;

    @GetMapping("/list")
    public TableDataInfo getCustomers(CustomerInfo info) {
        startPage();
        List<CustomerInfo> customerInfos = service.getCustomerInfos(info);
        return getDataTable(customerInfos);
    }

    @PostMapping("/add")
    public AjaxResult addCustomers(@Validated(addValidator.class) @RequestBody CustomerInfo info){
        int i = service.addCustomerInfo(info);

        return toAjax(i);
    }

    @PutMapping("/modify")
    public AjaxResult modifyCustomers(@Validated(modifyValidator.class) @RequestBody CustomerInfo info){
        int i = service.modifyCustomerInfo(info);
        return  toAjax(i);
    }


    @DeleteMapping("/delete/{customerIds}")
    public  AjaxResult deleteCustomerByIds(@PathVariable Long[] customerIds){
        int i = service.deleteCustomerByIds(customerIds);
        return toAjax(i);
    }



}
