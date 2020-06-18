package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create a Stream Example 1
		IntStream.of(new int[] { 4, 7, 1, 8, 3, 9, 7 }).//data source
		filter((int i) -> i > 5).distinct() //Intermediate Operations, returns stream
				.forEach(System.out::println); //Terminal operations, return data types, or void 
		
		System.out.println("\n Create Stream==============");
		Stream<Integer> emptyStream = Stream.empty();
		System.out.println("\t Empty Stream count"+emptyStream.count());
		
		System.out.println("\n Create Stream==============");
		emptyStream=Stream.of(7, 2, 6, 9, 4, 3, 1);
		System.out.println("\t Data Stream count"+emptyStream.count());
		
		//Using Collection
		System.out.println("\n Create Stream==============");
		List<String> listOfStrings = new ArrayList<>();
		listOfStrings.add("David");
		listOfStrings.add("Johnson");
		listOfStrings.add("Samontika");
		listOfStrings.add("Brijesh");
		listOfStrings.add("John");
		listOfStrings.add("David");
		listOfStrings.stream().forEach(System.out::println);
		
		System.out.println("\n Create filter Stream==============");
		listOfStrings.stream().filter((String name) -> name.length() >5).forEach(System.out::println);
	
		System.out.println("\n Create distinct filter Stream==============");
		listOfStrings.stream().distinct().forEach(System.out::println);
	
		System.out.println("\n Select first 3 elements using limit==============");
		listOfStrings.stream().limit(3).forEach(System.out::println);
		
		System.out.println("\n skip first 3 elements using limit==============");
		listOfStrings.stream().skip(3).forEach(System.out::println);
		
	
	}

}
