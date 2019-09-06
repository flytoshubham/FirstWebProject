package com.allstate.training.thread;

public class ThreadDemo1 {
public static void main(String args[])
{  
	MyThread t1=new MyThread();
	MyThread2 t3=new MyThread2();
	 Thread thread=new Thread(t1,"mythread");
	thread.start();
}
}
