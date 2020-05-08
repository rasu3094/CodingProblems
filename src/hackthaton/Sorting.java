package hackthaton;

import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;

public class Sorting {

    
    public static void main(String[] args) throws IOException, ParseException {
    	
    	int[] a = {10, 9, 7, 101, 23, 44, 12, 78, 34, 23};  
    	int count = 0;
    	String[] input = {"Hi","Hello"};
    	Arrays.sort(input);
    	for(int i=0;i<input.length;i++)  
        {  
            System.out.println(input[i]);  
        } 
    	System.out.println(a);
    	
    	for(int i=0;i<10;i++)  
        {  
            System.out.println(a[i]);  
        } 
    	
    	for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[i]<a[j]) {
					
					count++;
//					int temp = a[i];
//					a[i]= a[j];
//					a[j]=temp;
					
					//without temp variable
					a[i] = a[i]+a[j];
					a[j] = a[i]-a[j];
					a[i] = a[i]-a[j];
					
					
				}
			}
		}
         
        System.out.println("Printing Sorted List ...  "+ count);  
        for(int i=0;i<10;i++)  
        {  
            System.out.println(a[i]);  
        }  
    	
    }
    
}


//for(int i=0;i<10;i++)  
//{  
//	System.out.print(i+" a");
//    for (int j=0;j<i;j++)  
//    {  
//    	System.out.print(j+"b ");
//        if(a[i]<a[j])  
//        {  
//        	count++;
//            int temp = a[i];  
//            a[i]=a[j];  
//            a[j] = temp;   
//        }  
//    }  
//    System.out.println("");
//} 