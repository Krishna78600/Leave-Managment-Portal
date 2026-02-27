package com.leavemgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leavemgmt.model.LeaveApplications;

@Repository
public interface LeaveRepository extends JpaRepository<LeaveApplications, Long>{

}
