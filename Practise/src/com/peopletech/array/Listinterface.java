package com.peopletech.array;
import java.util.*;

public class Listinterface {
	public static void main(String[] args){

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0, 1);
		l1.add(1, 2);
		System.out.println(l1);
		
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);

		// Will add list l2 from 1 index
		l1.addAll(1, l2);

		System.out.println(l1);

		// Removes element from index 1
		l1.remove(1);

		// Printing the updated List 1
		System.out.println(l1);

		// Replace 0th element with 5
		// in List 1
		l1.set(0, 5);

		// Again printing the updated List 1
		System.out.println(l1);
	}
}
