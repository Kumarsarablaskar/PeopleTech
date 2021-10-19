package com.peopletech.ass2;


class ReverseString {
	public static String reverseStringWords() {
		String s1 ="i like this program very much";
	    String s2 = "";
	    String a[] = s1.split(" ");
	    for (int i = 0; i < a.length; i++) {
	        System.out.print(a[i] + " ");
	    }
	    for (int i = a.length - 1; i >= 0; i--) {
	        s2 = s2 + a[i] + " ";
	    }
	    System.out.println("\n"+ s2);
	    return s2;
	}
	
	public static void main(String[] args) {
		
		reverseStringWords();
		
	}
	 
}

