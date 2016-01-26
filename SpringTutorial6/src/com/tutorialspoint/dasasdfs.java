package com.tutorialspoint;

public class dasasdfs {
	public static void main(String[] args) {
		String str = "1000";

		// returns signed decimal short value of string
		short shortValue = Short.parseShort(str);

		// prints signed decimalshort value
		System.out.println("Signed decimal short value for given String is =" + shortValue);

		// returns the string argument as a signed short in the radix
		shortValue = Short.parseShort(str, 2);
		System.out.println("Signed decimal short value for specified String  with radix 2 is = " + shortValue);

		// returns the string argument as a signed short in the radix
		shortValue = Short.parseShort("11", 8);
		System.out.println("Signed decimal short value for specified String with radix 8 is = " + shortValue);
	}
}
