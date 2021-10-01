package com.peopletech.sample1;

import java.util.Comparator;

public class ProductByRating implements  Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		// TODO Auto-generated method stub
		return p1.getRating()-p2.getRating();
	}
  
}
