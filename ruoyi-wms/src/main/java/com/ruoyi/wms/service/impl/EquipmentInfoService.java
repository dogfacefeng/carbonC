package com.ruoyi.wms.service.impl;

import com.ruoyi.wms.domain.EquipmentInfo;
import com.ruoyi.wms.mapper.EquipmentInfoMapper;
import com.ruoyi.wms.service.IEquipmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentInfoService
        implements IEquipmentInfoService {


    @Autowired
    private EquipmentInfoMapper mapper;


    @Override
    public List<EquipmentInfo> getEquipmentInfos() {
        List<EquipmentInfo> allEquipmentInfo = mapper.getEquipmentInfos();
        return  allEquipmentInfo;
    }
}
