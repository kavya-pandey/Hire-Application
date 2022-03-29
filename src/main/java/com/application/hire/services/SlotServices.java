package com.application.hire.services;

import java.util.List;

import com.application.hire.entities.Slot;

public interface SlotServices {
	// return all slots
	public List<Slot> getAllSlots();
	//return slots according to date
	public List<Slot> dateWiseSlots(String date);
    //Updates status of slot
	public Slot updateStatus(Slot slot);
	//Add new slot
	public Slot addNewSlot(Slot slot);
	//Delete a slot
	public void deleteSlot(int slotId);
}
