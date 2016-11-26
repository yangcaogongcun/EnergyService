package com.stand.spring.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "edata200000000001")
public class eData200000000001 {
    @Id
    @Column(name = "data_id")
    private Integer dataId;

    @Column(name = "data_datetim")
    private Date dataDatetim;

    @Column(name = "data_vals")
    private String dataVals;

    /**
     * @return data_id
     */
    public Integer getDataId() {
        return dataId;
    }

    /**
     * @param dataId
     */
    public void setDataId(Integer dataId) {
        this.dataId = dataId;
    }

    /**
     * @return data_datetim
     */
    public Date getDataDatetim() {
        return dataDatetim;
    }

    /**
     * @param dataDatetim
     */
    public void setDataDatetim(Date dataDatetim) {
        this.dataDatetim = dataDatetim;
    }

    /**
     * @return data_vals
     */
    public String getDataVals() {
        return dataVals;
    }

    /**
     * @param dataVals
     */
    public void setDataVals(String dataVals) {
        this.dataVals = dataVals;
    }
}