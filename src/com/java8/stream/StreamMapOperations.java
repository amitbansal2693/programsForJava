package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Map operations on Stream
 * Returns a stream consisting of results after applying given function to elements of the stream.
 * @author Dell
 *
 */
public class StreamMapOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using Collection
		System.out.println("\n Create Stream==============");
		
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");
		
		System.out.println("\n Map Result into stream==============");
		names.stream().map(String::length).forEach(System.out::println);
		
		System.out.println("\n sort stream natural ordering==============");
		names.stream().sorted().forEach(System.out::println);
		
		System.out.println("\n Reduce method==============");
		OptionalInt sum = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).reduce((a, b) -> a+b);
		System.out.println("sum is "+sum.getAsInt());
		OptionalInt min = Arrays.stream(new int[] {7, 5, 9, 2, 8, 1}).min();
		System.out.println("Minimum is "+min.getAsInt());
	    
		System.out.println("\n Stream Collect, return list or set==============");
		List<String> first3Names = names.stream().limit(3).collect(Collectors.toList());
		System.out.println("Collect Method to collect result"+first3Names);

		System.out.println("\n Stream find boolean result using anyMatch==============");
		System.out.println("Any Match Exists: "+names.stream().anyMatch((String name) -> name.length() == 5));
	
		System.out.println("\n Stream find first element==============");
		System.out.println(Stream.of("First", "Second", "Third", "Fourth").findFirst().get());
		
		System.out.println("\n Stream to Iterate element==============");
		Stream.of("First", "Second", "Second", "Third", "Fourth").limit(3).distinct().forEach(System.out::println);

		System.out.println("\n Stream to arrays==============");
		System.out.println(Arrays.toString(names.stream().limit(3).toArray()));
	
	}
	
	

}
