package hackthaton;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TripletsComparison {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	Integer[] output = new Integer[]{0,0};
    	IntStream.rangeClosed(0, a.size()-1).forEach(i -> {
    		if (a.get(i)> b.get(i)) {
    			output[0]++;
    		} else if (a.get(i) < b.get(i)) {
    			output[1]++;
    		}
    	});
    	return Arrays.asList(output);

    }

    public static void main(String[] args) throws IOException {
        System.out.println(compareTriplets(Arrays.asList(17,28,30), Arrays.asList(99,16,8)));
    }
}
