package com.people.practise;

import java.util.Comparator;

public class BookByPublisher implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return (o1.getPublisher().compareTo (o2.getPublisher()));
	}

}
