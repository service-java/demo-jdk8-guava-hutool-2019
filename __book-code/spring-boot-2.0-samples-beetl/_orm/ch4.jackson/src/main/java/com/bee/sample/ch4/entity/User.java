package com.bee.sample.ch4.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

public class User {
    public interface IdView {

    }

    public interface IdNameView extends IdView {

    }


    @JsonView(IdView.class)
    private Integer id;
    @JsonView(IdNameView.class)
    private String name;
    @JsonIgnore
    BigDecimal salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

}
