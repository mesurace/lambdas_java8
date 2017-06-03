/**
 * This program is about java 8 - map and streams
 */
package com.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Suresh Adhikari
 *
 */
public class Lambdas_03 {

	public static void main(String[] args) {

		Arrays.asList("yello", "red", "orange", "green", "blue").stream().sorted().findFirst()
				.ifPresent(System.out::println);

		String[] fruits = new String[] { "Apple", "Orange", "Banana", "Mango" };

		Stream.of(fruits).filter(fruit -> {
			return fruit.startsWith("O");
		}).forEach(f -> System.out.println(f));

		List<String> collected = Stream.of(fruits).map(mapper -> mapper.toUpperCase()).collect(Collectors.toList());
		System.out.println(collected.toString());
	}

}
