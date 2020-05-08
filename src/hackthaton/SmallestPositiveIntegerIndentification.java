package hackthaton;

public class SmallestPositiveIntegerIndentification {
	
	public static void main(String[] args) {
		
		//int arr[] = {-10,-3,1,29,-2};
		int arr[] = {1,3,5,0,2};
		int smallestPositive = findSmallestPositiveIntegerInUnsortedArray(arr, arr.length);	
		System.out.println("Smallest Positive Integer In Unsorted Array : "+ smallestPositive);
	}

	private static int findSmallestPositiveIntegerInUnsortedArray(int[] arr, int size) {
		
		boolean[] present = new boolean[size+1];
		
		for (int i = 0; i < size; i++) {			
			if(arr[i] > 0 && arr[i]<=size) {
				present[arr[i]] = true;
			}			
		}
		for (int i = 1; i < size; i++) {
			if(!present[i]) {
				return i;
			}
		}
		return size+1;
		
	}
	

}
