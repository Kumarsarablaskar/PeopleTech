package com.peopletech.sample1;

import java.util.Comparator;

public class MovieByPrice implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return o1.getPrice()-o2.getPrice();
	}
	

}
