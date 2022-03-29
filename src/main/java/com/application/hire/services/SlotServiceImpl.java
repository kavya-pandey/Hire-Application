package com.application.hire.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.hire.dao.SlotDao;
import com.application.hire.entities.Slot;
import com.application.hire.services.SlotServices;

@Service
public class SlotServiceImpl implements SlotServices {

	@Autowired
	private SlotDao slotDao;

	@Override
	public List<Slot> getAllSlots() {
		// TODO Auto-generated method stub
		return (List<Slot>) slotDao.findAll();
	}

	@Override
	public List<Slot> dateWiseSlots(String date) {
		// TODO Auto-generated method stub
		// date = date.replace("-", "/");
		List<Slot> slotsBydate = new ArrayList<Slot>();
		List<Slot> allSlot = new ArrayList<Slot>();
//		allSlot=(List<slots>) slotDao.findAll();
//		for(slots slot : allSlot) {
//			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//			Date d = null;
//			try {
//				d = formatter.parse(slot.getDate());
//				System.out.println(d);
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			if(d == date) {
//				slotsBydate.add(slot);
//			}
//		}

		allSlot = (List<Slot>) slotDao.findAll();
		for (Slot slot : allSlot) {
			if (slot.getDate().equals(date)) {
				slotsBydate.add(slot);
			}
		}
		return slotsBydate;
	}

	@Override
	public Slot updateStatus(Slot slot) {
		// TODO Auto-generated method stub
//		List<Slot> listofSlots = new ArrayList<Slot>();
//		listofSlots = (List<Slot>) slotDao.findAll();
//		for (Slot s : listofSlots) {
//			if (s.getSlotId() == slot.getSlotId()) {
//				s.setStatus(slot.getStatus());
//			}
//		}
		slotDao.save(slot);

		return slot;
	}

	@Override
	public Slot addNewSlot(Slot slot) {
		slotDao.save(slot);
		return slot;
	}

	@Override
	public void deleteSlot(int slotId) {
		Slot entity = slotDao.getOne(slotId);
		slotDao.delete(entity);
	}

}
