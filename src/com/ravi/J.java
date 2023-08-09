package com.ravi;

public class J {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			String s = null;  // String s = "null" then output will be ===>   1 4    only
			System.out.println(s.length());
			
		}
		//System.out.println("hi");
		catch(NullPointerException ex){
			System.out.println(8);
			System.out.println(ex);
			try {
				int i = 23/0;
				
			}finally {
				System.out.println(6);
			}
			System.out.println(7);
		}
	}

}

/*
 * 			OUTPUT
 * 
 * 1 
 * 8 java.lang.NullPointerException: Cannot invoke "String.length()" because  "s" is null 
 * 6 
 * Exception in thread "main" java.lang.ArithmeticException: / by zero 
 * at com.ravi.J.main(J.java:16)
 */


