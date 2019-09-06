package com.allstate.training.thread;

public class First {
	public void display(String msg)
	{
		System.out.println("["+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("]");
	}

}
class Second extends Thread{
	String msg;
	First fobj;
	Second(First fp, String str)
	{
		fobj=fp;
		msg=str;
		start();
	}
	public void run()
	{
		
		fobj.display(msg);
		
	}
	

}
