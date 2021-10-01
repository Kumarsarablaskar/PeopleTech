package com.people.practise;

import java.util.Scanner;
import java.util.TreeSet;

import com.peopletech.sample1.Movie;
import com.peopletech.sample1.MovieByDuration;
import com.peopletech.sample1.MovieByName;

public class TreesetDemo {

   public static void main(String[] args) {

		TreeSet<Book> Books=null;    

		Scanner sc=new Scanner(System.in);
		System.out.println("How would you like to Sort Book");
		String sort=sc.next();

	    if(sort.equalsIgnoreCase("name"))
	        Books=new TreeSet<Book>(new BookByName());


	    else if(sort.equalsIgnoreCase("publisher"))
	    	Books=new TreeSet<Book>(new BookByPublisher());

	    else if(sort.equalsIgnoreCase("author"))
	    	Books=new TreeSet<Book>(new BookByAuthor());
	    
	    Books.add(new Book(101,"D","Yashwant kanetkar","BPB",8));
	    Books.add(new Book(102,"Data communication","Forouzan","Mc Graw Hill",4));
	    Books.add(new Book(103,"Operating System","Galyin","wiley",6));
	    
        System.out.println(Books);

	    	
}
}