package com.stand.spring.model;

import javax.persistence.*;

@Table(name = "ports")
public class Ports {
    @Id
    @Column(name = "Port_Id")
    private Integer portId;

    @Column(name = "Port_Name")
    private String portName;

    @Column(name = "Port_Com")
    private String portCom;

    @Column(name = "Port_Baud")
    private String portBaud;

    @Column(name = "Port_Data")
    private String portData;

    @Column(name = "Port_Dev")
    private Integer portDev;

    @Column(name = "Port_Int")
    private Integer portInt;

    @Column(name = "Port_Av")
    private Integer portAv;

    @Column(name = "Port_Des")
    private String portDes;

    @Column(name = "Port_Ty")
    private Integer portTy;

    /**
     * @return Port_Id
     */
    public Integer getPortId() {
        return portId;
    }

    /**
     * @param portId
     */
    public void setPortId(Integer portId) {
        this.portId = portId;
    }

    /**
     * @return Port_Name
     */
    public String getPortName() {
        return portName;
    }

    /**
     * @param portName
     */
    public void setPortName(String portName) {
        this.portName = portName;
    }

    /**
     * @return Port_Com
     */
    public String getPortCom() {
        return portCom;
    }

    /**
     * @param portCom
     */
    public void setPortCom(String portCom) {
        this.portCom = portCom;
    }

    /**
     * @return Port_Baud
     */
    public String getPortBaud() {
        return portBaud;
    }

    /**
     * @param portBaud
     */
    public void setPortBaud(String portBaud) {
        this.portBaud = portBaud;
    }

    /**
     * @return Port_Data
     */
    public String getPortData() {
        return portData;
    }

    /**
     * @param portData
     */
    public void setPortData(String portData) {
        this.portData = portData;
    }

    /**
     * @return Port_Dev
     */
    public Integer getPortDev() {
        return portDev;
    }

    /**
     * @param portDev
     */
    public void setPortDev(Integer portDev) {
        this.portDev = portDev;
    }

    /**
     * @return Port_Int
     */
    public Integer getPortInt() {
        return portInt;
    }

    /**
     * @param portInt
     */
    public void setPortInt(Integer portInt) {
        this.portInt = portInt;
    }

    /**
     * @return Port_Av
     */
    public Integer getPortAv() {
        return portAv;
    }

    /**
     * @param portAv
     */
    public void setPortAv(Integer portAv) {
        this.portAv = portAv;
    }

    /**
     * @return Port_Des
     */
    public String getPortDes() {
        return portDes;
    }

    /**
     * @param portDes
     */
    public void setPortDes(String portDes) {
        this.portDes = portDes;
    }

    /**
     * @return Port_Ty
     */
    public Integer getPortTy() {
        return portTy;
    }

    /**
     * @param portTy
     */
    public void setPortTy(Integer portTy) {
        this.portTy = portTy;
    }
}