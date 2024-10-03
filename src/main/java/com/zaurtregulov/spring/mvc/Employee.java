package com.zaurtregulov.spring.mvc;

import javax.validation.constraints.*;

public class Employee {

    @Size(min = 2,message = "name must be min 2 symbols")
    private String name;
    @NotEmpty(message = "surname is required field")
    private String surname;
    @Min(value = 500,message = "must be greater then 499")
    @Max(value = 1000,message = "must be less  then 1001")
    private int salary;
    private String department;
    private String carBrend;
    private  String [] lenguages;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XXX-XX-XX")

    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getLenguages() {
        return lenguages;
    }

    public void setLenguages(String[] lenguages) {
        this.lenguages = lenguages;
    }

    public String getCarBrend() {
        return carBrend;
    }

    public void setCarBrend(String carBrend) {
        this.carBrend = carBrend;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee() {
    }
}
