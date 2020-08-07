package com.javi.amazonvieweradv.models;

import java.util.ArrayList;

/**
 * Extends from {@link Movie}
 * @see Film
 * */

public class Chapter extends Movie {

	private int id;
	private int seasonNumber;
	private Series series;
	
	public Chapter(String title, String genre, String creator, int duration, short year, int seasonNumber, Series series) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
		this.setSeasonNumber(seasonNumber);
		this.setSeries(series);
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public int getSeasonNumber() {
		return seasonNumber;
	}
	
	public Series getSerie() {
		return series;
	}
	
	public void setSeries(Series series) {
		this.series = series;
	}

	public void setSeasonNumber(int seasonNumber) {
		this.seasonNumber = seasonNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n :: SERIES ::" + 
				"\n Title: " + getSerie().getTitle() +
				"\n :: CHAPTER ::" + 
				"\n Title: " + getTitle() +
				"\n Year: " + getYear() + 
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
	}
	
	public static ArrayList<Chapter> makeChaptersList(Series series) {
		ArrayList<Chapter> chapters = new ArrayList();
		
		for (int i = 1; i <= 5; i++) {
			chapters.add(new Chapter("Capituo "+i, "genero "+i, "creator" +i, 45, (short)(2017+i), i, series));
		}
		
		return chapters;
	}
	
	
	@Override
	public void view() {
		// TODO Auto-generated method stub
		super.view();
		ArrayList<Chapter> chapters =  getSerie().getChapters();
		int chapterViewedCounter = 0;
		for (Chapter chapter : chapters) {
			if (chapter.getIsViewed()) {
				chapterViewedCounter++;
			}
		}
		
		if (chapterViewedCounter == chapters.size()) {
			getSerie().view();
		}
	}
	
	

}
