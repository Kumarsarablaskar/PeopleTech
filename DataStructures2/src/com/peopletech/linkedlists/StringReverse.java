package com.peopletech.linkedlists;

public class StringReverse {

   public static String reverseInputString(String myString) {

		if (myString == null)
			return myString;
		else {
			String reverseString ="";

			for (int i = myString.length()-1; i >= 0; i--) {

				reverseString = reverseString + myString.charAt(i);
			}
			return reverseString;
		}

	}

	public static void main(String[] args) {

		String myString = "abc";
		System.out.println("reverse of " + myString + " = " + reverseInputString(myString));
    }
	
	
}


