package com.application.hire.Config;


import org.springframework.stereotype.Component;
import org.springframework.batch.item.ItemProcessor;

import com.application.hire.entities.BackgroundSync;
import com.application.hire.entities.TurbohireDummy;



@Component
public class MyCustomProcessor implements ItemProcessor<TurbohireDummy, BackgroundSync> {

	@Override
	public BackgroundSync process(TurbohireDummy bsync) throws Exception {
		System.out.println("MyBatchProcessor : Processing data : "+bsync);
		BackgroundSync tdata = new BackgroundSync();
		tdata.setInterviewid(bsync.getInterviewid());
		tdata.setInterviewemail(bsync.getInterviewemail());
		tdata.setApplicantname(bsync.getApplicantname());
		tdata.setFinalverdict(bsync.getFinalverdict());
		tdata.setRoundid(bsync.getRoundid());
		tdata.setTimeslot(bsync.getTimeslot());
		return tdata;
	}

	


	
}