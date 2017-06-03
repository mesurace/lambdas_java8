package com.funtionalInterface;

import java.util.function.Predicate;

/**
 * @author Suresh Adhikari
 *
 */
public class Lambdas_01 {

	public static void main(String[] args) {

		// retuns true if input string is "Apples" otherwise false
		Predicate<String> stringLen = (s) -> s.equals("Apples");
		System.out.println(stringLen.test("Apples"));
		System.out.println(stringLen.test("Oranges"));
		
		
		
	}

}
