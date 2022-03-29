package com.application.hire.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Slot {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int slotId;
	private int userId;
	private String emailId;
	private String status;
	private String date;
	private String startTime;
	private String endTime;
	// private String skills;
	// private String round;

	public Slot() {
	};

	public Slot(int slotId, String status, String date, String startTime, String endTime, String emailId, int userId) {
		super();
		this.slotId = slotId;
		this.status = status;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
		this.emailId = emailId;
		this.userId = userId;
	}

	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	public int getSlotId() {
		return slotId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public void setemailId(String emailId) {
		this.emailId = emailId;
	}

	public String getemailId() {
		return emailId;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
