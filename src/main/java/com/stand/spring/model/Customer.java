package com.stand.spring.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "Customer_Id")
    private Integer customerId;

    @Column(name = "Customer_Name")
    private String customerName;

    @Column(name = "Customer_Pwd")
    private String customerPwd;

    @Column(name = "Customer_Dev")
    private String customerDev;

    @Column(name = "Customer_Des")
    private String customerDes;

    @Column(name = "Customer_Contact")
    private String customerContact;

    @Column(name = "Customer_Phone")
    private String customerPhone;

    @Column(name = "Customer_Addr")
    private String customerAddr;

    @Column(name = "Customer_Email")
    private String customerEmail;

    @Column(name = "Customer_Date")
    private Date customerDate;

    @Column(name = "Customer_Class")
    private Integer customerClass;

    @Column(name = "Customer_Seg")
    private Integer customerSeg;

    @Column(name = "Customer_Reg")
    private Integer customerReg;

    @Column(name = "Customer_State")
    private Boolean customerState;

    /**
     * @return Customer_Id
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * @return Customer_Name
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * @return Customer_Pwd
     */
    public String getCustomerPwd() {
        return customerPwd;
    }

    /**
     * @param customerPwd
     */
    public void setCustomerPwd(String customerPwd) {
        this.customerPwd = customerPwd;
    }

    /**
     * @return Customer_Dev
     */
    public String getCustomerDev() {
        return customerDev;
    }

    /**
     * @param customerDev
     */
    public void setCustomerDev(String customerDev) {
        this.customerDev = customerDev;
    }

    /**
     * @return Customer_Des
     */
    public String getCustomerDes() {
        return customerDes;
    }

    /**
     * @param customerDes
     */
    public void setCustomerDes(String customerDes) {
        this.customerDes = customerDes;
    }

    /**
     * @return Customer_Contact
     */
    public String getCustomerContact() {
        return customerContact;
    }

    /**
     * @param customerContact
     */
    public void setCustomerContact(String customerContact) {
        this.customerContact = customerContact;
    }

    /**
     * @return Customer_Phone
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * @param customerPhone
     */
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    /**
     * @return Customer_Addr
     */
    public String getCustomerAddr() {
        return customerAddr;
    }

    /**
     * @param customerAddr
     */
    public void setCustomerAddr(String customerAddr) {
        this.customerAddr = customerAddr;
    }

    /**
     * @return Customer_Email
     */
    public String getCustomerEmail() {
        return customerEmail;
    }

    /**
     * @param customerEmail
     */
    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    /**
     * @return Customer_Date
     */
    public Date getCustomerDate() {
        return customerDate;
    }

    /**
     * @param customerDate
     */
    public void setCustomerDate(Date customerDate) {
        this.customerDate = customerDate;
    }

    /**
     * @return Customer_Class
     */
    public Integer getCustomerClass() {
        return customerClass;
    }

    /**
     * @param customerClass
     */
    public void setCustomerClass(Integer customerClass) {
        this.customerClass = customerClass;
    }

    /**
     * @return Customer_Seg
     */
    public Integer getCustomerSeg() {
        return customerSeg;
    }

    /**
     * @param customerSeg
     */
    public void setCustomerSeg(Integer customerSeg) {
        this.customerSeg = customerSeg;
    }

    /**
     * @return Customer_Reg
     */
    public Integer getCustomerReg() {
        return customerReg;
    }

    /**
     * @param customerReg
     */
    public void setCustomerReg(Integer customerReg) {
        this.customerReg = customerReg;
    }

    /**
     * @return Customer_State
     */
    public Boolean getCustomerState() {
        return customerState;
    }

    /**
     * @param customerState
     */
    public void setCustomerState(Boolean customerState) {
        this.customerState = customerState;
    }
}