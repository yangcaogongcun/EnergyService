package com.stand.spring.model;

import javax.persistence.*;

@Table(name = "regions")
public class Regions {
    @Id
    @Column(name = "Reg_Id")
    private Integer regId;

    @Column(name = "Reg_Name")
    private String regName;

    /**
     * @return Reg_Id
     */
    public Integer getRegId() {
        return regId;
    }

    /**
     * @param regId
     */
    public void setRegId(Integer regId) {
        this.regId = regId;
    }

    /**
     * @return Reg_Name
     */
    public String getRegName() {
        return regName;
    }

    /**
     * @param regName
     */
    public void setRegName(String regName) {
        this.regName = regName;
    }
}