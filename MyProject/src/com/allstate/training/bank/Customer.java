package com.allstate.training.bank;
import java.util.Scanner;
public class Customer {
	String typ;
	float bal;
	void deposit(float amount,String type)
	{if(amount>0)
	{
		if(type.equals("Savings")|| type.equals("savings")) 
			{
			if(amount%100==0)
				bal+=amount;
				
				else
					System.out.println("Multiples of 100 Only ");
				
		}
		if(type.equals("Current")||type.equals("current"))
			bal+=amount;
		
		System.out.println("available balance "+bal);
	}
	else
		System.out.println("Wrong Amount");
	}
	void withdraw(float am,String type)
	{
		if(am>0)
		{
		if(type.equals("Savings")|| type.equals("savings"))
			{if(bal>=1000)
				bal-=am;
			}
			
		if(type.equals("Current")||type.equals("current"))
		{
			if(bal>=1000)
				bal-=am;
		}
		else
			System.out.println("Not enough balance ");
		System.out.println("available balance "+bal);
	}
		else
		  System.out.println("Wrong amount");
	}



public static void main(String args[])
{  
	
	Customer c=new Customer();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter type of the account");
	String type1=sc.next();
	System.out.println("Enter balance in the account");
	c.bal=sc.nextFloat();
	System.out.println(" Deposit or Withdraw");
	String f=sc.next();
	if(f.equals("Deposit")){
		System.out.println("Enter the amount");
		float a=sc.nextFloat();
		c.deposit(a, type1);
	}
	else
	{System.out.println("Enter the amount");
	float a=sc.nextFloat();
	c.withdraw(a, type1);
	
		
	}
	
}
}
