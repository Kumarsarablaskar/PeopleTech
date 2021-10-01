package com.peopletech.sample1;

import java.util.Comparator;

public class ProductByPrice implements Comparator<Product> {
	
 public int compare(Product p1, Product p2) {
	 return (int) (p1.getPrice()-p2.getPrice());
 }
 
}
