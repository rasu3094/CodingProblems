package hackthaton;

import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;

public class SortingString2 {

	
    
    public static void main(String[] args) throws IOException, ParseException {
    	
    	String value = "geeksnielson";
    	
    	char tempArray[] = value.toCharArray();
    	
    	System.out.println(Arrays.toString(tempArray));
    	
    	//Arrays.sort(tempArray);
    	
    	System.out.println(Arrays.toString(tempArray));
    	
    	for (int i = 0; i < tempArray.length; i++) {
			System.out.println((int)tempArray[i]);
		}
    	
    	for (int i = 0; i < tempArray.length; i++) {
			for (int j = 0; j < i; j++) {
				if ((int)tempArray[i] < (int)tempArray[j]) {
					char temp = tempArray[i];
					tempArray[i] = tempArray[j];
					tempArray[j] = temp;
				}
			}
		}
       System.out.println(new String(tempArray)); 
    	
    }
}