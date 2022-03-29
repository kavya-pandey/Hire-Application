package com.application.hire.controller;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.hire.entities.BackgroundSync;
import com.application.hire.entities.TurbohireDummy;
import com.application.hire.services.BackgroundSyncService;



@RestController
public class BackgroundSyncController {

	@Autowired
	private BackgroundSyncService service;
	
	//add all the updated data from turbohiredummy table to backgroundsync table
	@PostMapping(value="/save-backgroundSync")
	@Transactional
	public void backgoundSyncData( @RequestBody BackgroundSync backgroundsync) {
		service.SaveBackgroundSync(backgroundsync) ;

		}
	
	//add hard coded data to  turbohiredummy table
	@PostMapping(value="/save-turbohire")
	@Transactional
	public void turboHireData( @RequestBody TurbohireDummy turbohiredummy) {
		service.SaveTurbohireDummy(turbohiredummy) ;

		}
	
	@GetMapping("/bymonth/{interviewemail}")
	public int getbymonth(@PathVariable("interviewemail")String interviewemail)
	{
		int i=service.currentmonth(interviewemail);
		return i;
	}
	
	@GetMapping("/byyear/{interviewemail}")
	public int getbyyear(@PathVariable("interviewemail")String interviewemail)
	{
		int i=service.currentyear(interviewemail);
		return i;
	}
	
	@GetMapping("/byquarter/{interviewemail}")
	public int getbyquarter(@PathVariable("interviewemail")String interviewemail)
	{
		int i=service.currentquarter(interviewemail);
		return i;
	}
	
	
	
	
}
