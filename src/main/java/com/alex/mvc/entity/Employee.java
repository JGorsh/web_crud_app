package com.alex.mvc.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @Size(min =2, message = "name must be min 2 symbols")
    @NotBlank(message = "empty field")
    private String name;

    @Column(name = "surname")
    @Size(min =2, message = "surname must be min 2 symbols")
    @NotBlank(message = "empty field")
    private String surname;

    @Column(name = "department")
    @NotBlank(message = "empty field")
    private String department;

    @Column(name = "salary")
    @Min(value = 100, message = "value must be >= 100")
    @Max(value = 15000, message = "value must be <= 15000")
    private int salary;

    public Employee() {
    }

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
