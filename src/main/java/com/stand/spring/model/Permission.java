package com.stand.spring.model;

import javax.persistence.*;

@Table(name = "permission")
public class Permission {
    @Id
    private Integer id;

    private String permissionname;

    private Integer roleid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return permissionname
     */
    public String getPermissionname() {
        return permissionname;
    }

    /**
     * @param permissionname
     */
    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname;
    }

    /**
     * @return roleid
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}