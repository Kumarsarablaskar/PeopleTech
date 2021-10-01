package com.peopletech.sample1;

public class Product implements Comparable<Product> {
   
	private double price;
	private String name;
	private int rating;
	public Product() {
		
	}
	public Product(double price, String name, int rating) {
		super();
		this.price = price;
		this.name = name;
		this.rating = rating;
	}

	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Product [price=" + price + ", name=" + name + ", rating=" + rating + "]";
	}
	@Override
	public int compareTo(Product argo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
