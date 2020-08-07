package com.javi.amazonviewer.models;

import java.util.Date;

public class Magazine extends Publication {

	private int id;
	

	public Magazine(int id, String title, Date editionDate, String editorial) {
		super(title, editionDate, editorial);
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	
	
	@Override 
	public String toString() {
		
		return "\n :: MAGAZINE ::" +
				"\n Title: " + getTitle() +
				"\n Editorial: " + getEditorial() +
				"\n Edition Date: " + getEditionDate();
				
	}

	
    

}
