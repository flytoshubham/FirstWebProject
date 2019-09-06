package com.allstates.training.assignment;

public class Savings implements Account {
	double bal;
	public Savings(double bal)
	{
		this.bal=bal;
	}
	public Savings(float bal) {
		this.bal=bal;
	}
	public double withdraw(double am)
	{ 
		if(am>0 && (bal-am)>=1000)
			{bal-=am;
		
			}
		else
			System.out.println("Wrong amount");
		return bal;
	}
	public double deposit(int am)
	{ if(am>0)
		{bal+=am;
		
		}
	else
		System.out.println("Wrong amount");
	return bal;
	}

}
