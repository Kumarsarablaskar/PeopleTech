package com.peopletech.sample;

public class OrderException extends Exception
{
    int qty;
    public OrderException(int qty) {
	 this.qty=qty;
    }
    public String toString() {
    	return "\nYour requested qty is:"+qty+"\nTo place a wholesale order for books is min 6 required";
    }
}
