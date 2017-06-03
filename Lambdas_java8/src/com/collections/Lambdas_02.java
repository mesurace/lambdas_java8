/**
 * This is lambda representation of java collections
 */
package com.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Suresh Adhikari
 *
 */
public class Lambdas_02 {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Apple", "Orange", "Banana", "Mango");
		
		System.out.println("Before sorting: " + fruits);

		// sorting list using Camparator: Anonymous type
		Collections.sort(fruits, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}

		});

		System.out.println("After sorting: "+ fruits);
		fruits = Arrays.asList("Apple", "Orange", "Banana", "Mango");
		// lambda representation of above anonymous type
		Collections.sort(fruits, (o1, o2) -> o1.compareTo(o2));
		
	}

}
