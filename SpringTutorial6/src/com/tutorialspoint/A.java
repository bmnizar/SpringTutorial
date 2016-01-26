package com.tutorialspoint;
	public class A implements Runnable{
		public static void main(String[] args) throws Exception{
			A a = new A();
			a.go();
		}
		
		public void go() throws Exception{
			System.out.println("one");
			run();
			System.out.println("two");
			run();
		}
		
		public void run(){
			for(int i=0; i<100; i++){
				System.out.println(i);
			}
		}
	}