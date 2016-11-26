package com.stand.spring.model;

import java.util.Date;
import javax.persistence.*;

public class realdata {
    @Id
    @Column(name = "Dev_Id")
    private Long devId;

    @Column(name = "State")
    private Integer state;

    @Column(name = "DateTime")
    private Date datetime;

    @Column(name = "Data1")
    private String data1;

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
     * @return State
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return DateTime
     */
    public Date getDatetime() {
        return datetime;
    }

    /**
     * @param datetime
     */
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    /**
     * @return Data1
     */
    public String getData1() {
        return data1;
    }

    /**
     * @param data1
     */
    public void setData1(String data1) {
        this.data1 = data1;
    }
}