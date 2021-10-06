package com.peopletech.sample;

public class Bank {
   public void accountHolder(String name,int age) throws AgeException
   {
	   if(age<18)
			throw new AgeException(age);
		else 
			System.out.println("Your account has been Created");
   }
	public static void main(String[] args) {
		Bank age=new Bank();
		try {
			age.accountHolder("Santhosh",25);
			age.accountHolder("Naresh",15);
			
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
	}

}
