package com.allstate.training.thread;

public class MyThread2 implements Runnable {

	
		public void run() {
			
			for (int i = 12; i < 20; i++) {
				System.out.println(i);
			}
			
        }
	
}
