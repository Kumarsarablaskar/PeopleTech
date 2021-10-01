package com.peopletech.lab5;

import java.util.Scanner;

public class TrafficLight {

    public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose one colour : ");
		System.out.println("red");
		System.out.println("yellow");
		System.out.println("green");
		String colour = scan.next();
		light(colour);
		
	}
	
	public static void light(String colour){
		
		switch (colour){
			case "red": System.out.println("Stop");break;
			case "yellow": System.out.println("Ready");break;
			case "green": System.out.println("Go");break;
			default:System.out.println("Choose only one: red or yellow or green");  
		}
		
	}
}
