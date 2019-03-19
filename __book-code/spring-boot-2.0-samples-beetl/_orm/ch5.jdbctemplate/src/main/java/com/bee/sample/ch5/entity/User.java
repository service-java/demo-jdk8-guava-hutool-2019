package com.bee.sample.ch5.entity;

import java.io.Serializable;
import java.math.*;
import java.util.Date;
import java.sql.Timestamp;

/*
 *
 * gen by beetlsql 2017-03-18
 */
public class User implements Serializable {
    private Integer id;
    private Integer departmentId;
    //部门
    private String name;
    //创建时间
    private Date createTime;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}
