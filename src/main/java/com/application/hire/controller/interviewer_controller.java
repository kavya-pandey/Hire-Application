package com.application.hire.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.hire.entities.Interviewer;
import com.application.hire.services.Interviewer_Service;

@RestController
public class interviewer_controller {
	 @Autowired
	 private Interviewer_Service is;
	 
	
	 
	@GetMapping("/interviewer/{id}")
	public  ResponseEntity<Interviewer> getbyid(@PathVariable("id")int id)
	{
		Interviewer int1=is.getbyid(id);
		if(int1==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		else
		{
	    return ResponseEntity.status(HttpStatus.FOUND).body(int1);
		}
	}
	
	 
	@GetMapping("/interviewerall/")
	public  ResponseEntity<List<Interviewer>> getall()
	{
	    List<Interviewer> list=is.getall();
	    if(list.size()<=0)
	    {
	    	return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	    }
		return ResponseEntity.of(Optional.of(list));
	}
	
	//@GetMapping("/interviewer/byusername/{username}")
	//public  Interviewer getbyname(@PathVariable("username")String username)
	//{
		
		//return is.getbyname(username);
	//}
	
	
	@DeleteMapping("/interviewer/{id}")
	public  ResponseEntity<Interviewer> deletebyid(@PathVariable("id")int id)
	{
		
		Interviewer int1=is.deletebyid(id);
		if(int1==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		else
		{
	    return ResponseEntity.status(HttpStatus.FOUND).body(int1);
		}
	}
	



	@PutMapping("/interviewer/{id}")
	public  ResponseEntity<Interviewer> updatebyid(@RequestBody Interviewer int1,@PathVariable("id")int id)
	{

		Interviewer int2=is.updatebyid(int1, id);
		if(int2==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		else
		{
	    return ResponseEntity.status(HttpStatus.FOUND).body(int2);
		}
		 
		
		
	}
	
	@PostMapping("/interviewer/")
	public Interviewer create(@RequestBody Interviewer int1)
	{
		Interviewer int3= is.create(int1);
		 return int3;
	}
	
	
	
	
	
	
	
	

}