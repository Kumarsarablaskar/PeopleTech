package com.peopletech.sample1;

import java.util.Scanner;
import java.util.TreeSet;

public class ListOfMovies {
	public static void main(String[] args) {
		
		TreeSet<Movie> movies=null;    

		Scanner sc=new Scanner(System.in);
		System.out.println("How would you like to Sort Movie List");
		String sort=sc.next();

	    if(sort.equalsIgnoreCase("price"))
	        movies=new TreeSet<Movie>(new MovieByPrice());

	    else if(sort.equalsIgnoreCase("duration"))
	    	movies=new TreeSet<Movie>(new MovieByDuration());

	    else if(sort.equalsIgnoreCase("name"))
	    	movies=new TreeSet<Movie>(new MovieByName());
	    
	    movies.add(new Movie(1,"Rebel",4,400));
	    movies.add(new Movie(2,"F3",2,350));
	    movies.add(new Movie(3,"King",3,420));
	    
    System.out.println(movies);

	    	
}
}
