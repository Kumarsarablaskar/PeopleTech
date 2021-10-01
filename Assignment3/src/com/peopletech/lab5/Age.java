package com.peopletech.lab5;

import java.util.Scanner;

public class Age {

    public static void main(String[] args){
		
		Age a = new Age();
		try{
			Scanner scan = new Scanner(System.in);
			System.out.println("enter your age");
			int age = scan.nextInt();
			a.ageHolder(age);
		}
		catch(AgeException e){
			System.out.println(e.validateAge());
		}
		
	}
	
	public void ageHolder(int age) throws AgeException{
		if (age > 15){
			System.out.println("ok your age is accepted");
		}	
		else{
			throw new AgeException();
		}	
	}		
}

class AgeException extends Exception{
	
	public String validateAge(){
		return "your age should be more than 15";
	}
}
