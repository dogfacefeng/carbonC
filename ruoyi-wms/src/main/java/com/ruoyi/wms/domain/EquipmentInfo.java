package com.ruoyi.wms.domain;

import java.util.Date;



public class EquipmentInfo12 {
    private int id;
    private String equipName;
    private String equipCode;
    private String equipType;
    private Date productionDate;
    private  String productionNumber;
    private String productionName;
    private int equipStatus;

    public int getId() {
        return id;
    }

    public String getEquipName() {
        return equipName;
    }

    public String getEquipCode() {
        return equipCode;
    }

    public String getEquipType() {
        return equipType;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public String getProductionNumber() {
        return productionNumber;
    }

    public String getProductionName() {
        return productionName;
    }

    public int getEquipStatus() {
        return equipStatus;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setEquipName(String equipName) {
        this.equipName = equipName;
    }

    public void setEquipCode(String equipCode) {
        this.equipCode = equipCode;
    }

    public void setEquipType(String equipType) {
        this.equipType = equipType;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public void setProductionNumber(String productionNumber) {
        this.productionNumber = productionNumber;
    }

    public void setProductionName(String productionName) {
        this.productionName = productionName;
    }

    public void setEquipStatus(int equipStatus) {
        this.equipStatus = equipStatus;
    }


    public EquipmentInfo12() {
    }


    public EquipmentInfo12(int id, String equipName, String equipCode, String equipType, Date productionDate, String productionNumber, String productionName, int equipStatus) {
        this.id = id;
        this.equipName = equipName;
        this.equipCode = equipCode;
        this.equipType = equipType;
        this.productionDate = productionDate;
        this.productionNumber = productionNumber;
        this.productionName = productionName;
        this.equipStatus = equipStatus;
    }

    @Override
    public String toString() {
        return "EquipmentInfo12{" +
                "id=" + id +
                ", equipName='" + equipName + '\'' +
                ", equipCode='" + equipCode + '\'' +
                ", equipType='" + equipType + '\'' +
                ", productionDate=" + productionDate +
                ", productionNumber='" + productionNumber + '\'' +
                ", productionName='" + productionName + '\'' +
                ", equipStatus=" + equipStatus +
                '}';
    }
}
