package com.ravi;

public class B {
	public static void main(String[] args) {
		
		try {
			int a[] = {1,2,3,4,5};
			for(int i = 0; i <7 ; i++) {
				System.out.println(a[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("0");
		System.out.println(e);
		}
	}
}
/*
 * 			OUTPUT : 
 * 1
 * 2
 * 3
 * 4
 * 5
 * 0 
 * java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
 */
 