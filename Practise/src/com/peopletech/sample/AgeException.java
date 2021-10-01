package com.peopletech.sample;

public class AgeException extends Exception {
   int age;
  public AgeException(int age) {
	 this.age=age;
 }
  public String toString() {
  	return "You must have above 18 years";
  }
}
