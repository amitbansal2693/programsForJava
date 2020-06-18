package com.string.programs;

public class StringRotation {
	
	/**
	 * 1. check length of s1 and s2, should be same
	 * 2. s3= s1+s1
	 * 3. check s3 contains s2?
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "JavaJ2eeStrutsHibernate";
		 
        String s2 = "StrutsHibernateJavaJ2ee";
 
        //Step 1
        if(s1.length() != s2.length())
        {
            System.out.println("s2 is not rotated version of s1");
        }
        else
        {
            //Step 2
            String s3 = s1 + s1;
 
            //Step 3
            if(s3.contains(s2))
            {
                System.out.println("s2 is a rotated version of s1");
            }
            else
            {
                System.out.println("s2 is not rotated version of s1");
            }
        }
		
	}

}
