package com.leavemgmt.model;

import com.leavemgmt.enums.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="Employee_Details")
public class Employee{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long empId ;

    @Column(name = "emp_name")
    private String empName ;

    @Column(name = "department")
    private String department ;

    @Column(name = "email")
    private String email ;

    @Column(name = "password")
    private String password ;

    @ManyToOne
    @JoinColumn(name = "team_lead_id")
    private Employee teamLead ;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee manager ;

    @Enumerated(EnumType.STRING)
    private Role role ;

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(Employee teamLead) {
        this.teamLead = teamLead;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    
}

