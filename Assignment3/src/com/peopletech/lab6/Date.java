package com.peopletech.lab6;
import java.time.*;

public class Date {
	public static void main(String[] args){
	 LocalDate borndate = LocalDate.of(1999,12,5);
	 System.out.println("Borndate :"+borndate);
	 LocalDate now = LocalDate.now();
	 System.out.println("Current Date :"+now);
	 Period different = Period.between(borndate, now);
	 System.out.println("Printing the difference is :"+different);
	
	}

}