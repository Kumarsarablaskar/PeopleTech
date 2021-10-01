package com.peopletech.sample;

public class MyFirstObject {

	public static void main(String[] args) {
		r15 b1=new r15();
		b1.color="blue";
		b1.mileage="45kph";
		b1.riding();
	}

}
class r15{
	String color;
	String mileage;
	public void riding() {
		System.out.println("r15 can ride in any road condition");
	}
	
	
}