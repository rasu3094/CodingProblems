package hackthaton;

public class MaxProduct {
	
	public static void main(String[] args) {
		
		int arr[] = {-10,-3,1,29,-2};
		getMaximumProduct(arr);		
	}

	private static void getMaximumProduct(int[] arr) {
		
		int size = arr.length;
		
		//to store maximum and second maximum in the array
		int max1 = 0, max2 = Integer.MIN_VALUE;
		
		//to store minimum and second minimum in the array
		int min1 = 0, min2 = Integer.MAX_VALUE;
		
		
		for (int i = 0; i < size; i++) {
			
			//if current element is greater than max1 element, then update max1 and max2
			if(arr[i] > max1) {
				max2 = max1;
				max1=arr[i];
			}
			
			// if current element greater the max2 element but lesser than max1, then update max2
			else if(arr[i]> max2) {
				max2= arr[i];
			}
			
			//if current element is lesser than min1 element, then update min1 and min2
			if(arr[i] < min1) {
				min2 = min1;
				min1=arr[i];
			}
			
			// if current element lesser the min2 element but greater than min2, then update min2
			else if(arr[i]< min2) {
				min2= arr[i];
			}
			
		}
		System.out.println("Max product : "+ (min1*min2>max1*max2 ? min1*min2 : max1*max2));
		
	}
	

}
