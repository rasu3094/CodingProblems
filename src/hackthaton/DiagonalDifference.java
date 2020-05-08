package hackthaton;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result {

    private static int primary,secondary;

	/*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    	for (int i=arr.size()-1,j = 0; j < arr.size(); j++, i--) {
    		System.out.println(arr.get(j).get(i));
    		System.out.println(arr.get(j).get(j));
    		primary += arr.get(j).get(j);
    		secondary += arr.get(j).get(i);
		}
    	System.out.println(primary);
    	System.out.println(secondary);
    return -(primary-secondary);

    }

}

public class DiagonalDifference {
    public static void main(String[] args) throws IOException {

        List<List<Integer>> arr = new ArrayList<>();
        
        List<Integer> row1 = new ArrayList<>();
        List<Integer> row2 = new ArrayList<>();
        List<Integer> row3 = new ArrayList<>();
        row1.add(11); row1.add(2); row1.add(4);
        row2.add(4); row2.add(5); row2.add(6);
        row3.add(10); row3.add(8); row3.add(-12);
        arr.add(row1);arr.add(row2);
        arr.add(row3);
        System.out.println(arr);

        System.out.println(Result.diagonalDifference(arr));
    }
}

