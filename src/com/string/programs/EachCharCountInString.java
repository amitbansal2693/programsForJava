package com.string.programs;

import java.util.HashMap;


/**
 * Find the occurence of Characters/number in an array/String
 * 
 * 1. Create one HashMap object
 * 2. Iterate input array. For String convert it into char array
 * 3. If Present, increment by 1
 * 		 map.put(i, map.get(i)+1);
 * 4. else(insert 1st occurence)
 * 		map.put(i, 1);
 * 
 **/


public class EachCharCountInString {

	 public static void main(String[] args)
	    {
	       String inputString="Java J2EE Java JSP J2EE";
	       HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	      
	       //String to char array
	       char[] strArray = inputString.toCharArray();
	       
	       for (char c : strArray)
	        {
	            if(map.containsKey(c))
	            {
	                map.put(c, map.get(c)+1);
	            }
	            else
	            {
	                map.put(c, 1);
	            }
	        }
	         
	        System.out.println(inputString+" : "+map);
	    }
	
}
