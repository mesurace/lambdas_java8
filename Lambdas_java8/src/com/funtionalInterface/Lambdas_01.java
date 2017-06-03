package com.funtionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

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

		// one input no output
		Consumer<String> consumer = (s) -> System.out.println(s.toLowerCase());
		consumer.accept("Java 8-Functional Interfaces-Consumer");

		// Function Example
		Function<Integer, String> function = (num) -> Integer.toString(num);
		System.out.println(function.apply(5));

		// Supplier only has output
		Supplier<String> supplier = () -> "Hi! how are you ?";
		System.out.println(supplier.get());

		// binary operator example .It knows all are type Integer
		BinaryOperator<Integer> add = (a, b) -> a + b;
		System.out.println(add.apply(5, 5));

		// example of unary operator
		UnaryOperator<String> string = (s) -> s.toUpperCase();
		System.out.println(string.apply("hi!!"));

		// own functional interface
		Calculate addition = (a, b) -> a + b;
		Calculate substraction = (a, b) -> a - b;
		Calculate division = (a, b) -> a/b;
		Calculate multiplication = (a, b) -> a*b;

		System.out.println(addition.calc(5, 5));
		System.out.println(substraction.calc(5, 5));
		System.out.println(division.calc(5, 5));
		System.out.println(multiplication.calc(5, 5));

	}

}
