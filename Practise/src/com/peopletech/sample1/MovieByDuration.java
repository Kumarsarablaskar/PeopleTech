package com.peopletech.sample1;

import java.util.Comparator;

public class MovieByDuration implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		return (o1.getDuration() - o2.getDuration());
	}

}
