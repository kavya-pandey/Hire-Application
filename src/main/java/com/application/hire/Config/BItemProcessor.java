package com.application.hire.Config;

import org.springframework.batch.item.ItemProcessor;


import com.application.hire.entities.BackgroundSync;


public class BItemProcessor implements ItemProcessor<BackgroundSync,BackgroundSync>{

	@Override
	public BackgroundSync process(BackgroundSync tdata) throws Exception {
		// TODO Auto-generated method stub
		return tdata;
	}

}
