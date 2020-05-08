package hackthaton;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ZonedDateTime1 {

    
    public static void main(String[] args) throws IOException, ParseException {
    	
    	ZonedDateTime zdt = ZonedDateTime.now();
    	@SuppressWarnings("deprecation")
		Date date = new Date();
    	zdt.format(DateTimeFormatter.ISO_INSTANT);
    	System.out.println(date);
    	
    	//zdt.parse(text)
    	String a = zdt.format(DateTimeFormatter.ISO_INSTANT);
    	//Date date = new Date(a);
    	System.out.println(a);
    	
    	String pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX";

    	// since no built-in format, we provides pattern directly.
    	DateFormat df = new SimpleDateFormat(pattern);

    	Date myDate = df.parse("2011-08-12T20:17:46.384Z");
    	System.out.println(myDate);
    	
    }
    
}
