package com.ravi;

public class G {
		public static void main(String[] args) {
			try {
				System.out.println(1);
				int i = 10/0;
				System.out.println(2);
			}catch(NumberFormatException ex) {  // not get match Exception ie. ArithmeticException
				System.out.println(4);
				System.out.println(ex.getMessage());
				System.out.println(5);
			}finally {
				System.out.println(6);
			}
			System.out.println(5);
		}
}

/*
 *				OUTPUT
 * 1
 *  Exception in thread "main" 6 
 *  java.lang.ArithmeticException: / by zero 
 *  at com.ravi.G.main(G.java:7)
 *  
 *  
 *  IF you write ArithmeticException in catch block ie
 *  		catch(ArithmeticException  ex)
 *   
 *   then OUTPUT will be
 *   
				 	1
					4
					/ by zero
					5
					6
					5
 *   
 */