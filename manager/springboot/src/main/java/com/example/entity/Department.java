package com.example.entity;

import java.io.Serializable;

public class Department implements Serializable {
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;
    /** 部门名称 */
    private String name;
    /** 部门描述 */
    private String description;
    /** 主管ID */
    private Integer employeeId;
    private String employeeName;

    public Department() {
    }

    public Department(Integer id, String name, String description, Integer employeeId, String employeeName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}