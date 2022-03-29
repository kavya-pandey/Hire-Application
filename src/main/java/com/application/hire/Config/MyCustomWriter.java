package com.application.hire.Config;



import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.application.hire.dao.BackgroundSyncDao;
import com.application.hire.entities.BackgroundSync;



@Component
public class MyCustomWriter implements ItemWriter<BackgroundSync> {
	
	@Autowired
	BackgroundSyncDao tdao ;
	
	
	@Override
	public void write(List<? extends BackgroundSync> list) throws Exception {
		// TODO Auto-generated method stub
		for (BackgroundSync data : list) {
			System.out.println("MyCustomWriter    : Writing data    : " + data.getInterviewid()+" :" +data.getInterviewemail()+" : "+data.getApplicantname()+" : "+data.getFinalverdict()+" : "+data.getRoundid()+" "
					+ ": "+data.getTimeslot());
			tdao.save(data);
		}
		
	}
}