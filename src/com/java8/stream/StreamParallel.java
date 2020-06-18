package com.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamParallel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("David");
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");

		// Normal Execution, Collection Class default method stream()
		names.stream().filter((String name) -> name.length() > 5).
		forEach(System.out::println);

		// Parallel Execution, Collection Class default parallelStream
		names.parallelStream().// provide data source
		filter((String name) -> name.length() > 5). //intermediate operations
		forEach(System.out::println); //terminal operations


	}

}
