package com.example.entity;

import java.io.Serializable;

public class Salary implements Serializable {
    private static final long serialVersionUID = 1L;

    /** ID */
    private Integer id;
    private Integer employeeId;
    private Integer departmentId;
    private String year;
    private String time;
    private Double price;
    private String note;

    private String employeeName;
    private String departmentName;

    public Salary() {
    }

    public Salary(Integer id, Integer employeeId, Integer departmentId, String year, String time, Double price, String note, String employeeName, String departmentName) {
        this.id = id;
        this.employeeId = employeeId;
        this.departmentId = departmentId;
        this.year = year;
        this.time = time;
        this.price = price;
        this.note = note;
        this.employeeName = employeeName;
        this.departmentName = departmentName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}