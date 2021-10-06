package com.peopletech.sample1;

public class Movie implements Comparable<Movie>{
	private int id;
	private String name;
	private int duration;
	private int price;
	public Movie(int id, String name, int duration, int price) {
		super();
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", duration=" + duration + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Movie argo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
	
	
	

