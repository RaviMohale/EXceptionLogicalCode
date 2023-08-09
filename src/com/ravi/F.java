package com.ravi;

public class F {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			String s = null;
			System.out.println(s);
			System.out.println(s.length());
			System.out.println(2);
		}catch(NullPointerException ex) {
			System.out.println(4);
			System.out.println(s); // s is local variable you can use in that local block only ie .in try() block
			System.out.println(ex);
			System.out.println(5);
		}
		System.out.println(6);
	}

}


/*
 * it give compile time error on line no. 13 , s cannot be resolved to a variable
 * 
 * 			AFTER Commet the line no. 13
 * 
	 		1
			null
			4
			java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null
			5
			6
 * 
 */