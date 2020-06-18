package com.string.programs;

import java.util.Arrays;


/**
 * Two strings are called anagrams if they contain same set of characters but in different order
 * @author Dell
 *
 */
public class AnagramProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "School Master";
		String s2 = "The Classroom";
		String copyOfs1 = s1.replaceAll(" ", "");
		String copyOfs2 = s2.replaceAll(" ", "");

		if (copyOfs1.length() != copyOfs2.length()) {
			// Setting status as false if copyOfs1 and copyOfs2 doesn't have
			// same length

			System.out.println(s1 + " and " + s2 + " are anagrams");
			System.out.println("Not Matching length");
		}

		else {
			char[] s1Array = copyOfs1.toLowerCase().toCharArray();
			char[] s2Array = copyOfs2.toLowerCase().toCharArray();
			// Sorting both s1Array and s2Array
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			boolean status = Arrays.equals(s1Array, s2Array);
			if (status) {
				System.out.println(s1 + " and " + s2 + " are anagrams");
			} else {
				System.out.println(s1 + " and " + s2 + " are not anagrams");
			}

		}
	}

}
