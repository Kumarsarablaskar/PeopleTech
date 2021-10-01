package com.people.practise;

import java.util.Comparator;

public class BookByName implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return (o1.getName().compareTo (o2.getName()));
	}

	
	
}
