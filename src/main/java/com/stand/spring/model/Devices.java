package com.stand.spring.model;

import javax.persistence.*;

@Table(name = "devices")
public class Devices {
    @Id
    @Column(name = "Dev_Id")
    private Long devId;

    @Column(name = "Dev_Name")
    private String devName;

    @Column(name = "Dev_Port")
    private Integer devPort;

    @Column(name = "Dev_Addr")
    private Integer devAddr;

    @Column(name = "Dev_Des")
    private String devDes;

    @Column(name = "Dev_Ct")
    private Integer devCt;

    @Column(name = "Dev_Pt")
    private Integer devPt;

    @Column(name = "Dev_Ty")
    private Integer devTy;

    @Column(name = "Dev_Reg")
    private Integer devReg;

    @Column(name = "Dev_Seg")
    private Integer devSeg;

    @Column(name = "Dev_Class")
    private Integer devClass;

    @Column(name = "Dev_Price")
    private Double devPrice;

    @Column(name = "Dev_Unit")
    private String devUnit;

    /**
     * @return Dev_Id
     */
    public Long getDevId() {
        return devId;
    }

    /**
     * @param devId
     */
    public void setDevId(Long devId) {
        this.devId = devId;
    }

    /**
     * @return Dev_Name
     */
    public String getDevName() {
        return devName;
    }

    /**
     * @param devName
     */
    public void setDevName(String devName) {
        this.devName = devName;
    }

    /**
     * @return Dev_Port
     */
    public Integer getDevPort() {
        return devPort;
    }

    /**
     * @param devPort
     */
    public void setDevPort(Integer devPort) {
        this.devPort = devPort;
    }

    /**
     * @return Dev_Addr
     */
    public Integer getDevAddr() {
        return devAddr;
    }

    /**
     * @param devAddr
     */
    public void setDevAddr(Integer devAddr) {
        this.devAddr = devAddr;
    }

    /**
     * @return Dev_Des
     */
    public String getDevDes() {
        return devDes;
    }

    /**
     * @param devDes
     */
    public void setDevDes(String devDes) {
        this.devDes = devDes;
    }

    /**
     * @return Dev_Ct
     */
    public Integer getDevCt() {
        return devCt;
    }

    /**
     * @param devCt
     */
    public void setDevCt(Integer devCt) {
        this.devCt = devCt;
    }

    /**
     * @return Dev_Pt
     */
    public Integer getDevPt() {
        return devPt;
    }

    /**
     * @param devPt
     */
    public void setDevPt(Integer devPt) {
        this.devPt = devPt;
    }

    /**
     * @return Dev_Ty
     */
    public Integer getDevTy() {
        return devTy;
    }

    /**
     * @param devTy
     */
    public void setDevTy(Integer devTy) {
        this.devTy = devTy;
    }

    /**
     * @return Dev_Reg
     */
    public Integer getDevReg() {
        return devReg;
    }

    /**
     * @param devReg
     */
    public void setDevReg(Integer devReg) {
        this.devReg = devReg;
    }

    /**
     * @return Dev_Seg
     */
    public Integer getDevSeg() {
        return devSeg;
    }

    /**
     * @param devSeg
     */
    public void setDevSeg(Integer devSeg) {
        this.devSeg = devSeg;
    }

    /**
     * @return Dev_Class
     */
    public Integer getDevClass() {
        return devClass;
    }

    /**
     * @param devClass
     */
    public void setDevClass(Integer devClass) {
        this.devClass = devClass;
    }

    /**
     * @return Dev_Price
     */
    public Double getDevPrice() {
        return devPrice;
    }

    /**
     * @param devPrice
     */
    public void setDevPrice(Double devPrice) {
        this.devPrice = devPrice;
    }

    /**
     * @return Dev_Unit
     */
    public String getDevUnit() {
        return devUnit;
    }

    /**
     * @param devUnit
     */
    public void setDevUnit(String devUnit) {
        this.devUnit = devUnit;
    }
}