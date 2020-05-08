package hackthaton;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"}; 
        System.out.println( "The longest Common Prefix is : " + 
                                   getLongestCommonPrefix(input)); 

	}

	private static String getLongestCommonPrefix(String[] input) {
		int size = input.length; 
		  
        /* if size is 0, return empty string */
        if (size == 0) 
            return ""; 
  
        if (size == 1) 
            return input[0]; 
  
        /* sort the array of strings */
        Arrays.sort(input); 
        System.out.println(Arrays.asList(input));
  
        /* find the minimum length from first and last string */
        int end = Math.min(input[0].length(), input[size-1].length());
        
       
        /* find the common prefix between the first and 
           last string */
        int start = 0;
       
        while (start < end && input[0].charAt(start) == input[size-1].charAt(start)) {
        	start++;
        }
  
        return input[0].substring(0, start);
	}

}
