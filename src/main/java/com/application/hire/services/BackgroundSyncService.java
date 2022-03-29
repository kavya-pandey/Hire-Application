package com.application.hire.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.hire.dao.BackgroundSyncDao;
import com.application.hire.dao.TurbohireDao;
import com.application.hire.entities.BackgroundSync;
import com.application.hire.entities.Interviewer;
import com.application.hire.entities.TurbohireDummy;

@Service
public class BackgroundSyncService {

	
	@Autowired
	private BackgroundSyncDao dao;
	
	public BackgroundSyncService() {}
	public BackgroundSyncService(BackgroundSyncDao dao) {
		super();
		this.dao = dao;
	}
	 public void SaveBackgroundSync(BackgroundSync backgroundsync) {
			dao.save(backgroundsync);
		}
	 
	 
		public List<BackgroundSync> showAllInterviewers(){
		return (List<BackgroundSync>) dao.findAll();
	}
		@Autowired
		private TurbohireDao turbodao;
		
		 public void SaveTurbohireDummy(TurbohireDummy turbohiredummy) {
			 turbodao.save(turbohiredummy);
			}
		 
	public int currentmonth(String emailid)
	{
		int i=dao.getcurrentmonth(emailid);
		return i;
	}
	
	public int currentyear(String emailid) {
		
		int i=dao.getcurrentyear(emailid);
		return i;
		
	}
	public int currentquarter(String emailid) {
		int i=dao.getcurrentyear(emailid);
		return i;
		
	}

}
