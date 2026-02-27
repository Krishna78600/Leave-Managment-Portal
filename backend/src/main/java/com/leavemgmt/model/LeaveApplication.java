package com.leavemgmt.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Leave_Application")
public class LeaveApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "leave_app_id")
    private Long leaveAppId ;

    @Column(name = "leave_type")
    private String leaveType ;

    @Column(name = "start_date")
    private String startDate ;

    @Column(name = "end_date")
    private String endDate ; 

    @Column(name = "total_days")
    private String totalDays ;

    @Column(name = "reason")
    private String reason ;

    @Column(name = "created_on")
    private LocalDateTime createdOn ;

    @Column(name = "updated_on")
    private LocalDateTime updatedOn ; 

    @Column(name = "created_by")
    private String createdBy ;

    @Column(name = "updated_by")
    private String updatedBy ;

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

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    

}
