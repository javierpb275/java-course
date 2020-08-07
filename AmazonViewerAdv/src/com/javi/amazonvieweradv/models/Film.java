package com.javi.amazonvieweradv.models;

/**
 * <h2>Film</h2>
 * Film is an abstract parent class
 * <p>
 * This is the base class of the Films family, since it is abstract, you cannot create request.
 * It has the abstract method 
 * {@code view()} which is mandatory to be implemented to whichever belongs to the family.
 * 
 * @author Javi
 * @version 1.1
 * @since 2020
 * */

public abstract class Film {
	
	private String title;
    private String genre;
    private String creator;
    private int duration;
    private short year;
    private boolean viewed;
    
    
    
	public Film(String title, String genre, String creator, int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public short getYear() {
		return year;
	}
	public void setYear(short year) {
		this.year = year;
	}
	
	public String isViewed() {
		String seen = "";
		
		if(viewed == true) {
			seen = "Yes";
		} else {
			seen = "No";
		}
		
		return seen;
	}
	
	public boolean getIsViewed() {
		return viewed;
	}
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
    
	/**
	 * {@code view()} is an abstract method which is mandatory to be implemented.
	 * */
	public abstract void view();
    

}

