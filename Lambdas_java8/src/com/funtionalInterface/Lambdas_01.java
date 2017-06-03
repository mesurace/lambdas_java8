package com.funtionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author Suresh Adhikari
 *
 */
public class Lambdas_01 {

	public static void main(String[] args) {

		// retuns true if input string is "Apples" otherwise false
		Predicate<String> stringCompare = (s) -> s.equals("Apples");
		System.out.println(stringCompare.test("Apples"));
		System.out.println(stringCompare.test("Oranges"));
		
		//one input no output
		Consumer<String> consumer=(s)-> System.out.println(s.toLowerCase());
		consumer.accept("Java 8-Functional Interfaces-Consumer");
		
		//Function Example
		Function<Integer,String> function=(num)->Integer.toString(num);
		System.out.println(function.apply(5));
		
		Supplier<String> supplier=()->"Hi! how are you ?";
		System.out.println(supplier.get());
		
		
		
		
	}

}
