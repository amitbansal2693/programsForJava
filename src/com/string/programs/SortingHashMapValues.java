package com.string.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

/**
 * 1. Using Java 8.
 * 
 * Map interface has some default method to sort by Value.
 * 
 * This interface has also implemented sort by key.
 *  
**/
public class SortingHashMapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String, Integer> studentMap = new HashMap<String, Integer>();
        studentMap.put("Jyous", 87);
        studentMap.put("Klusener", 82);
        studentMap.put("Xiangh", 91);
        studentMap.put("Lisa", 89);
        studentMap.put("Narayan", 95);
        studentMap.put("Arunkumar", 86);
        System.out.println("Before Sorting : "+studentMap);
        
        // EntrySet-->Stream--->sort Stream--->Collect Result
        Map<String,Integer> sortedIdNameMap =studentMap.entrySet() //get entry set
                   .stream() //convert it into stream
                   .sorted(Entry.comparingByValue()) //sort stream by value
                   .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,  e2) -> e1, LinkedHashMap::new));
 
        System.out.println("After Sorting By Values : "+sortedIdNameMap);
	
        //Sort by Key
        Map<String, Integer> sortedStudentKey 
        = studentMap.entrySet()
                    .stream()
                    .sorted(Entry.comparingByKey())
                    .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        System.out.println("After Sorting By Name Key : "+sortedStudentKey);
	}
}
