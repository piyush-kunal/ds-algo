package com.algo.search;

public class BinarySearch {
	
	static int count = 0;
	public int binarySearch(int[] arr, int low, int high, int x){
		if(high >=1) {
			int mid = low+(low+high)/2;
			if(arr[mid]==x) {
				count++;
				return mid;
			}
			if(arr[mid]<x) {
				count++;
				return binarySearch(arr, mid-1, high, x);
			}
			if (arr[mid]>x) {
				count++;
				return binarySearch(arr, low, mid-1, x);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch ob = new BinarySearch();
		int[] arr = new int[] {2,3,4,5,6,7,8,89};
		int n = arr.length;
		int x = 8;
		int result = ob.binarySearch(arr, 0, n-1, x);
		if (result == -1)
            System.out.println("Element not present");
        else
        	System.out.println(count);
            System.out.println("Element found at index "+result);
		
	}

}
