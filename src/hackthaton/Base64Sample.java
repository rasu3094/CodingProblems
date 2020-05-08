package hackthaton;

import java.io.IOException;
import java.text.ParseException;
import java.util.Base64;

public class Base64Sample {

    
    public static void main(String[] args) throws IOException, ParseException {
    	
    	// create a sample String to encode 
        String sample = "India Team will win the Cup"; 
  
        // print actual String 
        System.out.println("Sample String:\n"
                           + sample); 
  
        // Encode into Base64 format 
        String BasicBase64format 
            = Base64.getEncoder() 
                  .encodeToString(sample.getBytes()); 
  
        // print encoded String 
        System.out.println("Encoded String:\n"
                           + BasicBase64format); 
    	
    }
    
}
