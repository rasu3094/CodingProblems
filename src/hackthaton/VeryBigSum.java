package hackthaton;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VeryBigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
    	
    	List<Long> output = new ArrayList<>();
    	for (int i = 0; i < ar.length; i++) {
            output.add(ar[i]);
        }
    	return output.stream().mapToLong(Long::longValue).sum();

    }
    public static void main(String[] args) throws IOException {
        int input = 1000000000;

        long[] ar = new long[5];

        for (int i = 0; i < 5; i++) {
            ar[i] = input++;
            System.out.println(ar[i]);
        }
       System.out.println(aVeryBigSum(ar));    
       }
}
