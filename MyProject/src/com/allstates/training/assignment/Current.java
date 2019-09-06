package com.allstates.training.assignment;
import java.util.Scanner;

public class Current implements Account {
	
	double bal;
	public Current (double bal) {
		this.bal=bal;
	}
	public double withdraw(int am)
	{if(am>0 && (bal-am)>=10000)
		bal-=am;
	else
		System.out.println("Wrong am or low balance");
	
		return bal;
	}
	public double deposit(int am)
	{
		if(am>0)
			bal+=am;
		return bal;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Type: 1.Savings 2. Current ");
		int ch=sc.nextInt();
		System.out.println("Enter the balance");
		double bal=sc.nextDouble();
		switch(ch)
		{case 1:
			Savings s1=new Savings(bal);
			System.out.println("1.Withdraw  2.Deposit");
			int j=sc.nextInt();
			switch(j)
			{
			case 1:
				System.out.println("Enter the amount");
				double a=sc.nextDouble();
				System.out.println(s1.withdraw(a));
				break;
			case 2:	
				System.out.println("Enter the amount");
				double a3=sc.nextDouble();
				System.out.println(s1.deposit(a3));
				break;
			default:
				System.out.println("Invalid");
			}
			break;
		case 2:
			Current c1=new Current(bal);
			System.out.println("1.Withdraw  2.Deposit");
			int j1=sc.nextInt();
			switch(j1)
			{
			case 1:
				System.out.println("Enter the amount");
				double a1=sc.nextDouble();
				System.out.println(c1.withdraw(a1));
				break;
			case 2:	
				System.out.println("Enter the amount");
				double a2=sc.nextDouble();
				System.out.println(c1.deposit(a2));
				break;
			default:
				System.out.println("Invalid");
			}
			
			
		}
	}
}
