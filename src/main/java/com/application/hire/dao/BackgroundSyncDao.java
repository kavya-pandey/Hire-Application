package com.application.hire.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import  com.application.hire.entities.BackgroundSync;


public interface BackgroundSyncDao extends JpaRepository<BackgroundSync,String> {

	@Query(value="select count(*) from backgroundsync u where (Select month(u.timeslot))=(select month(current_timestamp)) and u.interviewemail=:emailid",nativeQuery=true)
	int getcurrentmonth(@Param("emailid")String emailid);
	
	
    
	@Query(value="select count(*) from backgroundsync u where (Select year(u.timeslot))=(select year(current_timestamp)) and u.interviewemail=:emailid",nativeQuery=true)
	int getcurrentyear(@Param("emailid")String emailid);
	
	@Query(value="select count(*) from backgroundsync u where (Select quarter(u.timeslot))=(select quarter(current_timestamp)) and u.interviewemail=:emailid",nativeQuery=true)
	int getcurrentquarter(@Param("emailid")String emailid);
	
	
	

}
