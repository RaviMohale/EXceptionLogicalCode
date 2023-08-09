package com.ravi;

public class H {
	
	static int test() {
		try {
			
		}catch(NumberFormatException ex) {
			return 20;
		}finally {
			
		}
		return 40;
	}
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(test());
		System.out.println(2);
	}

}

/*
 *		OUTPUT
 * 1 
 * 40
 * 2
 */
