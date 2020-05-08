package hackthaton;

import java.util.*;

public class SumCheck {
    public static void main(String args[]) {
       int arr[] = {1, 5, 7, -1}; 
       int sum = 6;
       int matchedSums = getMatchedSum(arr, sum);
       System.out.println("Matched Sum :"+matchedSums);
    }
    
    private static int getMatchedSum(int[] arr, int sum) {
        int size = arr.length;
        int matchCount = 0;
        //Using hashmap to achieve time complexity O(n)
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<size;i++) {
            //intialization
            if(!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],0);
            }
            hashMap.put(arr[i], hashMap.get(arr[i])+1);            
        }
        for(int i=0;i<size;i++) {
            if (Optional.ofNullable(hashMap.get(sum-arr[i])).isPresent()) {
                matchCount += hashMap.get(sum-arr[i]);
            }
            
            //To ignore same index matches
            if (arr[i] == sum-arr[i]){
                matchCount--;
            }
        }
        //Taking half to get the pairs
        return matchCount/2;
    }
}
