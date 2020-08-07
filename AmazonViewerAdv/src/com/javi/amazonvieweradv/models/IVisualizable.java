package com.javi.amazonvieweradv.models;

import java.util.Date;

public interface IVisualizable {
	
	/**
	 * This method gets the exact moment you started to watch something.
	 * 
	 * @param dateI is an object {@code Date} with the exact start date.
	 * @return It returns the date and the time.
	 * */
	Date startToSee(Date dateI);
	
	/**
	 * This method gets the exact moment you started and finished to watch something.
	 * 
	 * @param dateI is an object {@code Date} with the exact start date.
	 * @param dateF is an object {@code Date} with the exact final moment.
	 * */
	void stopToSee(Date dateI, Date dateF);

}
