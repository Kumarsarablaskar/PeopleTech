package com.peopletech.sample1;

import java.util.Scanner;
import java.util.TreeSet;

public class ProductList {
	public static void main(String[] args) {
		
	TreeSet<Product> prods=null;    

	Scanner sc=new Scanner(System.in);
	System.out.println("How would you like to Sort Product List");
	String sort=sc.next();

    if(sort.equalsIgnoreCase("price"))
        prods=new TreeSet<Product>(new ProductByPrice());

    else if(sort.equalsIgnoreCase("rating"))
        prods=new TreeSet<Product>(new ProductByRating());

    else if(sort.equalsIgnoreCase("name"))
        prods=new TreeSet<Product>();


    prods.add(new Product(17894.98,"Wireless Keyboard",5));
    prods.add(new Product(64537.78,"LED Screen",3));
    prods.add(new Product(63548.91,"Medical Screen",1));
    prods.add(new Product(32849.18,"Bluetooth Speaker",7));
    prods.add(new Product(28765.37,"Amazon Fire Stick",2));

    System.out.println(prods);

}
}

