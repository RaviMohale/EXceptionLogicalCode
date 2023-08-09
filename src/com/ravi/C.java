package com.ravi;

public class C {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			int i = 10/ 0;
			System.out.println(2);
		}catch(ArithmeticException ex) {
			System.out.println(3);
			System.out.println(ex.getMessage());
			System.out.println(4);
		}
		System.out.println(5);
	}

}


/*
 *     OUTPUT:
 * 1 
 * 3
 * / by zero
 * 4
 * 5
 */
