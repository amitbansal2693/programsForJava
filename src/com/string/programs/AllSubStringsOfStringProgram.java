
package com.string.programs;
public class AllSubStringsOfStringProgram {
	public static void main(String[] args) {
		String inputString="Amit";
		System.out.println("Enter Input String : "+inputString);
		System.out.println("All possible substrings of " + inputString + " are : ");
		//
		for (int i = 0; i < inputString.length(); i++) {
			for (int j = i + 1; j <= inputString.length(); j++) {
				System.out.println(inputString.substring(i, j));
			}
		}
	}
}