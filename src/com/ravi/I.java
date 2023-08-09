package com.ravi;

public class I {
	public static int test() {
		try {
			return 0;
		}finally {
			System.out.println("inside finally block");
		}
	}
	
	public static void main(String[] args) {
		System.out.println(I.test());
	}
	

}
/*
 *		OUTPUT
 * inside finally block 0
 */