package com.tutorialspoint;

import java.util.HashMap;

public class das {
	int j = 999;

	public static void main(String[] args) {
		int j=787;
		System.out.println(Short.parseShort("10",10));
		System.out.println(Short.parseShort("10"));
		System.out.println(new Boolean(true));
	
		System.out.println(Short.parseShort("10"));
		System.out.println(new Boolean(true));

		System.exit(11);
		System.out.println(j);
		int i = 0;
		char c = '0';
		int x = i + c;
		System.out.println(x);
		System.out.println(++i);
		System.out.println(i + '0');
		System.out.println(i);
		System.out.println(i--);
		System.out.println(null + "" + null);
		class abc {
			private int c = 10;

			public int getC() {
				return c;
			}

			public void setC(int c) {
				this.c = c;
			}

		}
		abc a = new abc();

		System.out.println(a.c);
	}

}
