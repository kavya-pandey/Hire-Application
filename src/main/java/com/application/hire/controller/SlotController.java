package com.application.hire.controller;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotat1ion.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.hire.entities.Slot;
import com.application.hire.services.SlotServices;

@RestController
public class SlotController {
	//@RequestMapping(value="/" , method = RequestMethod.GET)
	@Autowired
	private SlotServices slotService;

	// get all slots
	@GetMapping("/slots")
	public List<Slot> allSlots1(){
		return this.slotService.getAllSlots();
	}
	
//	@GetMapping("/date/{date}")
//	public List<slots> dateWiseSlots(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date){
//		//System.out.println(date);
//		//System.out.println(date.getDate());
//		return this.slotService.dateWiseSlots(date);
//	}
	
	// get all slots on the particular date
	@GetMapping("/date/{date}")
	public List<Slot> dateWiseSlots (@PathVariable("date") String date){
		List<Slot> slotsList = this.slotService.dateWiseSlots(date);
		return slotsList;
	}
	
	// update slot status
	@PutMapping("/status")
	public Slot updateStatus (@RequestBody Slot slot) {
		return this.slotService.updateStatus(slot);
	}
	
	// add new slot
	@PostMapping("/slots")
	public Slot addNewSlot(@RequestBody Slot slot) {
		return this.slotService.addNewSlot(slot);
	}
	
	//delete slot
	@DeleteMapping("/slots/{slotId}") 
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable int slotId) {
		try {
			this.slotService.deleteSlot(slotId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception E) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
