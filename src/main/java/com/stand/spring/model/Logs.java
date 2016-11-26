package com.stand.spring.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "logs")
public class Logs {
    @Id
    @Column(name = "Log_Id")
    private Integer logId;

    @Column(name = "Log_User")
    private String logUser;

    @Column(name = "Log_Date")
    private Date logDate;

    @Column(name = "Log_Time")
    private Date logTime;

    @Column(name = "Log_Ip")
    private String logIp;

    /**
     * @return Log_Id
     */
    public Integer getLogId() {
        return logId;
    }

    /**
     * @param logId
     */
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    /**
     * @return Log_User
     */
    public String getLogUser() {
        return logUser;
    }

    /**
     * @param logUser
     */
    public void setLogUser(String logUser) {
        this.logUser = logUser;
    }

    /**
     * @return Log_Date
     */
    public Date getLogDate() {
        return logDate;
    }

    /**
     * @param logDate
     */
    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    /**
     * @return Log_Time
     */
    public Date getLogTime() {
        return logTime;
    }

    /**
     * @param logTime
     */
    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }

    /**
     * @return Log_Ip
     */
    public String getLogIp() {
        return logIp;
    }

    /**
     * @param logIp
     */
    public void setLogIp(String logIp) {
        this.logIp = logIp;
    }
}