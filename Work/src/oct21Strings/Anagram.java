package oct21Strings;

import java.util.Arrays;

public class Anagram {
	 
	    public static boolean checkAnagram(String s1, String s2) {
	        if (s1.length() != s2.length()) {
	            return false;
	        }
	        else {
	        	char[] c1 = s1.toCharArray();
		        char[] c2 = s2.toCharArray();
		        Arrays.sort(c1);
		        Arrays.sort(c2);
		        return Arrays.equals(c1, c2);
	        }
	     
	    }
	 
	    public static void main(String[] args) {
	 
	        System.out.println(Anagram.checkAnagram("king","kick"));
	 
	    }
	 
	}

