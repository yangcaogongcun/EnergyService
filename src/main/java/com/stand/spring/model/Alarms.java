package com.stand.spring.model;

import javax.persistence.*;

@Table(name = "alarms")
public class Alarms {
    @Id
    @Column(name = "Al_Id")
    private Integer alId;

    @Column(name = "Al_Name")
    private String alName;

    @Column(name = "Al_DevId")
    private Integer alDevid;

    @Column(name = "Al_Point")
    private Integer alPoint;

    @Column(name = "Al_Type")
    private Integer alType;

    @Column(name = "Al_Max")
    private Double alMax;

    @Column(name = "Al_Min")
    private Double alMin;

    @Column(name = "Al_Out")
    private Integer alOut;

    @Column(name = "Al_Dev")
    private String alDev;

    /**
     * @return Al_Id
     */
    public Integer getAlId() {
        return alId;
    }

    /**
     * @param alId
     */
    public void setAlId(Integer alId) {
        this.alId = alId;
    }

    /**
     * @return Al_Name
     */
    public String getAlName() {
        return alName;
    }

    /**
     * @param alName
     */
    public void setAlName(String alName) {
        this.alName = alName;
    }

    /**
     * @return Al_DevId
     */
    public Integer getAlDevid() {
        return alDevid;
    }

    /**
     * @param alDevid
     */
    public void setAlDevid(Integer alDevid) {
        this.alDevid = alDevid;
    }

    /**
     * @return Al_Point
     */
    public Integer getAlPoint() {
        return alPoint;
    }

    /**
     * @param alPoint
     */
    public void setAlPoint(Integer alPoint) {
        this.alPoint = alPoint;
    }

    /**
     * @return Al_Type
     */
    public Integer getAlType() {
        return alType;
    }

    /**
     * @param alType
     */
    public void setAlType(Integer alType) {
        this.alType = alType;
    }

    /**
     * @return Al_Max
     */
    public Double getAlMax() {
        return alMax;
    }

    /**
     * @param alMax
     */
    public void setAlMax(Double alMax) {
        this.alMax = alMax;
    }

    /**
     * @return Al_Min
     */
    public Double getAlMin() {
        return alMin;
    }

    /**
     * @param alMin
     */
    public void setAlMin(Double alMin) {
        this.alMin = alMin;
    }

    /**
     * @return Al_Out
     */
    public Integer getAlOut() {
        return alOut;
    }

    /**
     * @param alOut
     */
    public void setAlOut(Integer alOut) {
        this.alOut = alOut;
    }

    /**
     * @return Al_Dev
     */
    public String getAlDev() {
        return alDev;
    }

    /**
     * @param alDev
     */
    public void setAlDev(String alDev) {
        this.alDev = alDev;
    }
}