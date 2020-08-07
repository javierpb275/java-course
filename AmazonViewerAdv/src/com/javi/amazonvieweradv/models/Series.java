package com.javi.amazonvieweradv.models;

import java.util.ArrayList;

public class Series extends Film {

	private int id;
	private int seasonQuantity;
	private ArrayList<Chapter> chapters;
	
	
	public Series(String title, String genre, String creator, int duration, int seasonQuantity) {
		super(title, genre, creator, duration);
		// TODO Auto-generated constructor stub
		this.seasonQuantity = seasonQuantity;
		
	}
    

	public int getId() {
		return id;
	}


	public int getSeasonQuantity() {
		return seasonQuantity;
	}


	public void setSeasonQuantity(int seasonQuantity) {
		this.seasonQuantity = seasonQuantity;
	}


	public ArrayList<Chapter> getChapters() {
		return chapters;
	}


	public void setChapters(ArrayList<Chapter> chapters) {
		this.chapters = chapters;
	}
	
	
	@Override 
	public String toString() {
		
		return "\n :: SERIE ::" +
				"\n Title: " + getTitle() +
				"\n Genre: " + getGenre() +
				"\n Year: " + getYear() +
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
				
	}
	
	public static ArrayList<Series> makeSeriesList() {
		ArrayList<Series> seriesList = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			Series serie = new Series("Serie "+i, "genero "+i, "creador "+i, 1200, 5);
			serie.setChapters(Chapter.makeChaptersList(serie));
			seriesList.add(serie);
			
		}
		
		return seriesList;
	}


	@Override
	public void view() {
		// TODO Auto-generated method stub
		setViewed(true);
	}
	
	
	

}

