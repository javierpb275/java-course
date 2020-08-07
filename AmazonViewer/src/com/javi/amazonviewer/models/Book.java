package com.javi.amazonviewer.models;

import java.util.ArrayList;

import java.util.Date;

public class Book extends Publication implements IVisualizable {

	private int id;
	private String isbn;
	private boolean readed;
	private int timeReaded;
	
	
	


	public Book(String title, Date editionDate, String editorial, String[] authors) {
		super(title, editionDate, editorial);
		// TODO Auto-generated constructor stub
		setAuthors(authors);
	}



	public int getId() {
		return id;
	}



	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public boolean isReaded() {
		String read = "";
		if(readed == true) {
			read = "Yes";
		}else {
			read = "No";
		}
		
		return readed;
	}



	public void setReaded(boolean readed) {
		this.readed = readed;
	}


	public int getTimeReaded() {
		return timeReaded;
	}


	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	
	@Override 
	public String toString() {
		String detailBook = "\n :: BOOK ::" +
							"\n Title: " + getTitle() +
							"\n Editorial: " + getEditorial() +
							"\n Edition Date: " + getEditionDate() +
							"\n Authors: ";
		for (int i = 0; i < getAuthors().length; i++) {
			detailBook += "\t" + getAuthors()[i];
		}
		return detailBook;
	}


	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}


	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if (dateF.getSeconds() > dateI.getSeconds()) {
			setTimeReaded(dateF.getSeconds() - dateI.getSeconds());
			
		} else {
			setTimeReaded(0);
		}
		
	}
	
	
	public static ArrayList<Book> makeBookList() {
		ArrayList<Book> books = new ArrayList();
		String[] authors = new String[3];
		for (int i = 0; i < 3; i++) {
			authors[i] = "author "+i;
		}
		for (int i = 1; i <= 5; i++) {
			books.add(new Book("Book " + i, new Date(), "editorial " + i, authors));
		}
		
		return books;
	}
	
	
	
    
}
