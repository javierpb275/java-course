package com.javi.amazonviewer;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.javi.amazonviewer.models.Book;
import com.javi.amazonviewer.models.Chapter;
import com.javi.amazonviewer.models.Movie;
import com.javi.amazonviewer.models.Series;
//import com.javi.makereport.Report;


public class Main {
    public static void main(String[] args) {
       
       showMenu();

   }

       public static void showMenu() {

         int exit = 0;
        
        do {

        System.out.println("WELCOME TO AMAZON VIEWER");
        System.err.println("");
        System.out.println("Select the number of your option");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("3. Books");
        System.out.println("4. Magazines");
        System.out.println("5. Report");
        System.out.println("6. Report Today");
        System.out.println("0. Exit");
        
        Scanner sc = new Scanner(System.in);
        
        int response = Integer.valueOf(sc.nextLine());
        
        

        switch (response) {
             case 0:
                exit = 0;
                break;
             case 1:
                showMovies();
                break;
             case 2:
                showSeries();
                break;
             case 3:
                showBooks();
                break;
             case 4:
                showMagazines();
                break;
             case 5:
                //makeReport();
                break;
             case 6:
               //Date date = new Date();
                //makeReport(new Date());
                break;
             default:
                System.out.println("Select an option." );
                break;
        	}

        } while(exit != 0);

    }
       
       static ArrayList<Movie> movies = Movie.makeMoviesList();

       
        public static void showMovies() {
           int exit = 0;
           ArrayList<Movie> movies = Movie.makeMoviesList();
           
           do {
        	   
              System.out.println();
              System.out.println(":: MOVIES ::");
              System.out.println();
              
              for (int i = 0; i < movies.size(); i++) {//1. Movie 1
            	  System.out.println(i+1 + ". " + movies.get(i).getTitle() + " Viewed: " + movies.get(i).isViewed());
			}
              
              System.out.println("0. Go back to Menu");
              System.out.println();
              
              //Read user's answer
              Scanner sc = new Scanner(System.in);
              int response = Integer.valueOf(sc.nextLine());
              
              if (response == 0) {
            	  showMenu();
              }
              
              Movie movieSelected = movies.get(response-1);
              movieSelected.setViewed(true);
              Date dateI = movieSelected.startToSee(new Date());
              
              for (int i = 0; i < 10000; i++) {
				System.out.println("........");
				
			}
              
              //Once Viewed
              movieSelected.stopToSee(dateI, new Date());
              System.out.println();
              System.out.println("Viewed: " + movieSelected);
              System.out.println("Time Viewed: " + movieSelected.getTimeViewed() + "milliseconds");
              
              

           } while(exit != 0);

        }

        
        public static void showSeries() {
    		int exit = 1;
    		ArrayList<Series> seriesList = Series.makeSeriesList();
    		do {
    			System.out.println();
    			System.out.println(":: SERIES ::");
    			System.out.println();
    			
    			for (int i = 0; i < seriesList.size(); i++) { //1. Series 1
    				System.out.println(i+1 + ". " + seriesList.get(i).getTitle() + " Viewed: " + seriesList.get(i).isViewed());
    			}
    			
    			System.out.println("0. Go back to Menu");
    			System.out.println();
    			
    			//Read user's answer
    			Scanner sc = new Scanner(System.in);
    			int response = Integer.valueOf(sc.nextLine());
    			
    			if(response == 0) {
    				showMenu();
    			}
    			
    			showChapters(seriesList.get(response-1).getChapters());
    			
    		}while(exit !=0);
    	}
        
    	
    	public static void showChapters(ArrayList<Chapter> chaptersOfSerieSelected) {
    		int exit = 0;
    		
    		do {
    			System.out.println();
    			System.out.println(":: CHAPTERS ::");
    			System.out.println();
    			
    			
    			for (int i = 0; i < chaptersOfSerieSelected.size(); i++) { //1. Chapter 1
    				System.out.println(i+1 + ". " + chaptersOfSerieSelected.get(i).getTitle() + " Viewed: " + chaptersOfSerieSelected.get(i).isViewed());
    			}
    			
    			System.out.println("0. Go back to Menu");
    			System.out.println();
    			
    			//Read user's answer
    			Scanner sc = new Scanner(System.in);
    			int response = Integer.valueOf(sc.nextLine());
    			
    			if(response == 0) {
    				showSeries();
    			}
    			
    			Chapter chapterSelected = chaptersOfSerieSelected.get(response-1);
    			chapterSelected.setViewed(true);
    			Date dateI = chapterSelected.startToSee(new Date());
    			
    			for (int i = 0; i < 100000; i++) {
    				System.out.println("..........");
    			}
    			
    			//Once Viewed
    			chapterSelected.stopToSee(dateI, new Date());
    			System.out.println();
    			System.out.println("Viewed: " + chapterSelected);
    			System.out.println("Time Viewed: " + chapterSelected.getTimeViewed() + " milliseconds");
    		}while(exit !=0);
    	}

    	public static void showBooks() {
    		int exit = 0;
    		ArrayList<Book> books= Book.makeBookList();
    		do {
    			System.out.println();
    			System.out.println(":: BOOKS ::");
    			System.out.println();
    			
    			for (int i = 0; i < books.size(); i++) { //1. Movie 1
    				System.out.println(i+1 + ". " + books.get(i).getTitle() + " Viewed: " + books.get(i).isReaded());
    			}
    			
    			System.out.println("0. Go back to Menu");
    			System.out.println();
    			
    			//Read user's answer
    			Scanner sc = new Scanner(System.in);
    			int response = Integer.valueOf(sc.nextLine());
    			
    			if(response == 0) {
    				showMenu();
    			}
    			
    			Book bookSelected = books.get(response-1);
    			bookSelected.setReaded(true);
    			Date dateI = bookSelected.startToSee(new Date());
    			
    			for (int i = 0; i < 100000; i++) {
    				System.out.println("..........");
    			}
    			
    			//Once Viewed
    			bookSelected.stopToSee(dateI, new Date());
    			System.out.println();
    			System.out.println("Readed: " + bookSelected);
    			System.out.println("Time Readed: " + bookSelected.getTimeReaded() + " milisegundos");
    		}while(exit !=0);
    	}
    	
        
        public static void showMagazines() {
    		int exit = 0;
    		do {
    			System.out.println();
    			System.out.println(":: MAGAZINES ::");
    			System.out.println();
    		}while(exit !=0);
    	}

        /*
        public static void makeReport() {
    		
    		Report report = new Report();
    		report.setNameFile("report");
    		report.setExtension("txt");
    		report.setTitle(":: VIEWED ::");
    		String contentReport = "";
    		
    		for (Movie movie : movies) {
    			if (movie.getIsViewed()) {
    				contentReport += movie.toString() + "\n";
    				
    			}
    		}
    		report.setContent(contentReport);
    		report.makeReport();
    		
    	}
    	
    	public static void makeReport(Date date) {
    		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    		String dateString = df.format(date);
    		Report report = new Report();
    		
    		report.setNameFile("report" + dateString);
    		report.setExtension("txt");
    		report.setTitle(":: VIEWED ::");
    		String contentReport = "";
    		
    		for (Movie movie : movies) {
    			if (movie.getIsViewed()) {
    				contentReport += movie.toString() + "\n";
    				
    			}
    		}
    		report.setContent(contentReport);
    		report.makeReport();
    	}
    	
    }
    
    */



}
