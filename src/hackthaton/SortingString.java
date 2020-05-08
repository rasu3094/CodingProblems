package hackthaton;

import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;

public class SortingString {

	
    
    public static void main(String[] args) throws IOException, ParseException {
    	
    	String value = "geeksnelson";
    	
    	String[] myArray = {"JavaFX", "HBase", "OpenCV", "Java", "Hadoop", "Neo4j"};
        int size = myArray.length;

        for(int i = 0; i<size-1; i++) {
           for (int j = i+1; j<myArray.length; j++) {
              if(myArray[i].compareTo(myArray[j])>0) {
                 String temp = myArray[i];
                 myArray[i] = myArray[j];
                 myArray[j] = temp;
              }
           }
        }
        System.out.println(Arrays.toString(myArray));
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