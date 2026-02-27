package com.leavemgmt.model;

import java.time.LocalDateTime;

import com.leavemgmt.enums.LeaveStatus;

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
@Table(name = "Leave_Applications")
public class LeaveApplications {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "leave_app_id")
    private Long leaveAppId;

    @Column(name = "leave_type")
    private String leaveType;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    @Column(name = "total_days")
    private String totalDays;

    @Column(name = "reason")
    private String reason;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedOn;


    // Employee
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;


    // Team Lead
    @ManyToOne
    @JoinColumn(name = "team_lead_id")
    private Employee teamLead;

    @Column(name = "team_lead_action")
    private String teamLeadAction ;

    @Column(name = "team_lead_comment")
    private String teamLeadComment ; 

    @Column(name = "team_lead_action_date")
    private LocalDateTime teamLeadActionDate ;


    // Manager
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Employee manager;

    @Column(name = "manager_action")
    private String managerAction ;

    @Column(name = "manager_comment")
    private String managerComment ; 

    @Column(name = "manager_action_date")
    private LocalDateTime managerActionDate ; 


    // HR
    @ManyToOne
    @JoinColumn(name = "hr_id")
    private Employee hr;

    @Column(name = "hr_action")
    private String hrAction ;

    @Column(name = "hr_comment")
    private String hrComment ;

    @Column(name = "hr_action_date")
    private LocalDateTime hrActionDate ;


    @Enumerated(EnumType.STRING)
    private LeaveStatus status = LeaveStatus.PENDING_TEAM_LEAD;


    public Long getLeaveAppId() {
        return leaveAppId;
    }

    public void setLeaveAppId(Long leaveAppId) {
        this.leaveAppId = leaveAppId;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(String totalDays) {
        this.totalDays = totalDays;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Employee getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(Employee teamLead) {
        this.teamLead = teamLead;
    }

    public String getTeamLeadAction() {
        return teamLeadAction;
    }

    public void setTeamLeadAction(String teamLeadAction) {
        this.teamLeadAction = teamLeadAction;
    }

    public String getTeamLeadComment() {
        return teamLeadComment;
    }

    public void setTeamLeadComment(String teamLeadComment) {
        this.teamLeadComment = teamLeadComment;
    }

    public LocalDateTime getTeamLeadActionDate() {
        return teamLeadActionDate;
    }

    public void setTeamLeadActionDate(LocalDateTime teamLeadActionDate) {
        this.teamLeadActionDate = teamLeadActionDate;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public String getManagerAction() {
        return managerAction;
    }

    public void setManagerAction(String managerAction) {
        this.managerAction = managerAction;
    }

    public String getManagerComment() {
        return managerComment;
    }

    public void setManagerComment(String managerComment) {
        this.managerComment = managerComment;
    }

    public LocalDateTime getManagerActionDate() {
        return managerActionDate;
    }

    public void setManagerActionDate(LocalDateTime managerActionDate) {
        this.managerActionDate = managerActionDate;
    }

    public Employee getHr() {
        return hr;
    }

    public void setHr(Employee hr) {
        this.hr = hr;
    }

    public String getHrAction() {
        return hrAction;
    }

    public void setHrAction(String hrAction) {
        this.hrAction = hrAction;
    }

    public String getHrComment() {
        return hrComment;
    }

    public void setHrComment(String hrComment) {
        this.hrComment = hrComment;
    }

    public LocalDateTime getHrActionDate() {
        return hrActionDate;
    }

    public void setHrActionDate(LocalDateTime hrActionDate) {
        this.hrActionDate = hrActionDate;
    }

    public LeaveStatus getStatus() {
        return status;
    }

    public void setStatus(LeaveStatus status) {
        this.status = status;
    }

    
}
