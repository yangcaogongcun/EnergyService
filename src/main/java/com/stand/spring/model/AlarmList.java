package com.stand.spring.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "alarmlist")
public class AlarmList {
    @Column(name = "Al_Id")
    private Integer alId;

    @Column(name = "Al_Date")
    private Date alDate;

    @Column(name = "Al_DevId")
    private Integer alDevid;

    @Column(name = "Al_Point")
    private Integer alPoint;

    @Column(name = "Al_Type")
    private Integer alType;

    @Column(name = "Al_Value")
    private Double alValue;

    @Column(name = "Al_Limit")
    private Double alLimit;

    @Column(name = "Al_Av")
    private Integer alAv;

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
     * @return Al_Date
     */
    public Date getAlDate() {
        return alDate;
    }

    /**
     * @param alDate
     */
    public void setAlDate(Date alDate) {
        this.alDate = alDate;
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
     * @return Al_Value
     */
    public Double getAlValue() {
        return alValue;
    }

    /**
     * @param alValue
     */
    public void setAlValue(Double alValue) {
        this.alValue = alValue;
    }

    /**
     * @return Al_Limit
     */
    public Double getAlLimit() {
        return alLimit;
    }

    /**
     * @param alLimit
     */
    public void setAlLimit(Double alLimit) {
        this.alLimit = alLimit;
    }

    /**
     * @return Al_Av
     */
    public Integer getAlAv() {
        return alAv;
    }

    /**
     * @param alAv
     */
    public void setAlAv(Integer alAv) {
        this.alAv = alAv;
    }
}