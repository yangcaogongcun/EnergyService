package com.stand.spring.model;

import javax.persistence.*;

@Table(name = "users")
public class Users {
    @Id
    @Column(name = "U_Id")
    private Integer uId;

    @Column(name = "U_Name")
    private String uName;

    @Column(name = "U_Pwd")
    private String uPwd;

    @Column(name = "U_Right")
    private Integer uRight;

    @Column(name = "U_Des")
    private String uDes;

    
    public Users() {
		// TODO Auto-generated constructor stub
	}
    
    public Users(String name,String pwd){
    	this.uName=name;
    	this.uPwd=pwd;
    }
    /**
     * @return U_Id
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * @param uId
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * @return U_Name
     */
    public String getuName() {
        return uName;
    }

    /**
     * @param uName
     */
    public void setuName(String uName) {
        this.uName = uName;
    }

    /**
     * @return U_Pwd
     */
    public String getuPwd() {
        return uPwd;
    }

    /**
     * @param uPwd
     */
    public void setuPwd(String uPwd) {
        this.uPwd = uPwd;
    }

    /**
     * @return U_Right
     */
    public Integer getuRight() {
        return uRight;
    }

    /**
     * @param uRight
     */
    public void setuRight(Integer uRight) {
        this.uRight = uRight;
    }

    /**
     * @return U_Des
     */
    public String getuDes() {
        return uDes;
    }

    /**
     * @param uDes
     */
    public void setuDes(String uDes) {
        this.uDes = uDes;
    }
}