package com.peopletech.sample;

public class OrderBurger {

public static void main(String[] args) {
Burger chickenTikka =new Burger();
chickenTikka.setStatus(Burger.BurgerStatus.ORDERED);
System.out.println("your order may take max:"+chickenTikka. getDeliveryTimeInMin());

}
}