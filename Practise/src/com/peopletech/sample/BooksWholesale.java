package com.peopletech.sample;

public class BooksWholesale {
	public void placeOrder(int qty) throws OrderException
	{
		if(qty<6)
			throw new OrderException(qty);
		else 
			System.out.println("Your Order has been Placed Successfully");
	}

	public static void main(String[] args) {
		BooksWholesale sales=new BooksWholesale();
		try {
			
			sales.placeOrder(9);
			sales.placeOrder(5);
		}
		catch(OrderException e) {
			System.out.println(e);
		}
	}

}
