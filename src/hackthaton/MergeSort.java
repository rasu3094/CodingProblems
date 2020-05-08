package hackthaton;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		 int arr[] = {12, 11, 13, 5, 6, 7, 1}; 
		  
	     System.out.println("Given Array");
	     System.out.println(Arrays.toString(arr));
	     
	     sort(arr, 0, arr.length-1);
	     
	     System.out.println("Sorted Array");
	     System.out.println(Arrays.toString(arr));

	}

	private static void sort(int[] arr, int l, int r) {
		if (l < r) {
			
			//finding middle element
			int m = (l+r)/2;
			
			//sort first half
			sort(arr, l, m);
			
			//sort second half
			sort(arr, m+1, r);
			
			//Merge the sorted halves			
			mergeSort(arr, l, m, r);
			
		}
	}

	private static void mergeSort(int[] arr, int l, int m, int r) {
		
		//Getting the size for two of the sub arrays.
		int n1 = m-l+1;  // m, l are index values, so adding one
		int n2 = r-m;	// for second half, we are starting with m+1, so we are ignoring adding 1
		
		//Creating two temp arrays
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];
		
		//Copying array values to sub array
		for (int i = 0; i < n1; i++) {
			leftArray[i] = arr[l+i];
		}
		for (int j = 0; j < n2; j++) {
			rightArray[j] = arr[m+1+j];
		}
		
		/* Merge the temp arrays */
		  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l;
        
        while(i < n1 && j <n2 ) {
        	if (leftArray[i] <= rightArray[j]) {
        		arr[k] = leftArray[i];
        		i++;
        	} else {
            	arr[k] = rightArray[j];
            	j++;
        	}
        	k++;
        }
        
        //Copy remaining items in leftArray if any...
        while (i < n1) {
        	arr[k] = leftArray[i];
    		i++;
    		k++;
		}
        
      //Copy remaining items in rightArray if any...
        while (j < n2) {
        	arr[k] = rightArray[j];
    		j++;
    		k++;
		}
	}

}
