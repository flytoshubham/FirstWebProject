package com.allstate.training.thread;

public class Synchro {
	
	
		public static void main(String args[]) {
			First fnew=new First();
			Second ss=new Second(fnew,"welcome");
			Second ss1=new Second(fnew,"new");
			Second ss2=new Second(fnew,"programmer");
			
		}
	}



