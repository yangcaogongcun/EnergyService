package com.stand.spring.model;

import javax.persistence.*;

@Table(name = "class")
public class Class {
    @Id
    @Column(name = "Class_Id")
    private Integer classId;

    @Column(name = "Class_Name")
    private String className;

    /**
     * @return Class_Id
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * @param classId
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * @return Class_Name
     */
    public String getClassName() {
        return className;
    }

    /**
     * @param className
     */
    public void setClassName(String className) {
        this.className = className;
    }
}