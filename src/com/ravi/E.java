package com.ravi;

public class E {
	public static void main(String[] args)throws ClassNotFoundException {
		System.out.println(1);
		if(true) {
			throw new ClassNotFoundException();
		}
		System.out.println(2);
	}

}
/*
 *				OUTPUT:
 *  1
 *  Exception in thread "main" java.lang.ClassNotFoundException 
 *  at com.ravi.E.main(E.java:7)
 */