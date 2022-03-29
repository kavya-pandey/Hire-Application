package com.application.hire.entities;
import com.application.hire.services.*;


import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import com.application.hire.services.BackgroundSyncService;

@Entity
public class Interviewer {
	
	@Id
	private int userId;
	
	private String emailid;
	private String username;
	private String primary_Skill;
	private String secondary_Skill;
	private String tertiary_Skill;
	private String round_Alloted ;
    private String profile_Image;
  
   
   



	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPrimary_Skill() {
		return primary_Skill;
	}
	public void setPrimary_Skill(String primary_Skill) {
		this.primary_Skill = primary_Skill;
	}
	public String getSecondary_Skill() {
		return secondary_Skill;
	}
	public void setSecondary_Skill(String secondary_Skill) {
		this.secondary_Skill = secondary_Skill;
	}
	public String getTertiary_Skill() {
		return tertiary_Skill;
	}
	public void setTertiary_Skill(String tertiary_Skill) {
		this.tertiary_Skill = tertiary_Skill;
	}
	public String getRound_Alloted() {
		return round_Alloted;
	}
	public void setRound_Alloted(String round_Alloted) {
		this.round_Alloted = round_Alloted;
	}
	
	public String getProfile_Image() {
		return profile_Image;
	}
	public void setProfile_Image(String profile_Image) {
		this.profile_Image = profile_Image;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Interviewer() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	public Interviewer(int userId, String emailid, String username, String primary_Skill, String secondary_Skill,
			String tertiary_Skill, String round_Alloted, String profile_Image) {
		super();
		this.userId = userId;
		this.emailid = emailid;
		this.username = username;
		this.primary_Skill = primary_Skill;
		this.secondary_Skill = secondary_Skill;
		this.tertiary_Skill = tertiary_Skill;
		this.round_Alloted = round_Alloted;
		
		this.profile_Image = profile_Image;
		
	}
	
	
}