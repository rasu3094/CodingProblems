package hackthaton;

import java.util.Arrays;

//	Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that prod[i] is equal to the product 
//		of all the elements of arr[] except arr[i]. Solve it without division operator in O(n) time.
//
/* 
 * 
 * Input: arr[]  = {10, 3, 5, 6, 2}
Output: prod[]  = {180, 600, 360, 300, 900}

Explanation: product array should be {180, 600, 360, 300, 900}
3 * 5 * 6 * 2 product of other array elements except 10 is 180
10 * 5 * 6 * 2 product of other array elements except 3 is 600
10 * 3 * 6 * 2 product of other array elements except 5 is 360
10 * 3 * 5 * 2 product of other array elements except 6 is 300
10 * 3 * 6 * 5 product of other array elements except 2 is 900
 */
public class ProductArray {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  = {10, 3, 5, 6, 2};
		System.out.println(Arrays.toString(arr));
		int product[] = getProductArray(arr, arr.length);
		System.out.println("Result : "+ Arrays.toString(product));
	}

	private static int[] getProductArray(int[] arr, int size) {	
		
		if (size == 1) {
			System.out.println("Zero");
			return null;
		}
		
		//temporary variable
		int temp=1;
		
		//result array
		int prod[] = new int[size];

		//array intialization
		for (int i = 0; i < size; i++) {
			prod[i] = 1;
		}		
		
		//temp variable contains the products of elements on the right side other than arr[i]
		for (int i = 0; i < size; i++) {
			prod[i] = temp;
			temp *=arr[i];
			System.out.println(Arrays.toString(prod));
		}
		
		//reassigning temp value to 1
		temp=1;
		
		//temp variable contains the products of elements on the left side other than arr[i]
		for(int i=size-1;i>=0;i--) {
			prod[i] *= temp;
			temp *=arr[i];			
			System.out.println(Arrays.toString(prod));
		}
		
		// TODO Auto-generated method stub
		return prod;
	}

}
