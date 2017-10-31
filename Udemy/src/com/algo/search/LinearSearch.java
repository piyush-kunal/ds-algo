package com.algo.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = new int[] {2,3,4,5,6,7};
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==7)
				System.out.println("Found at "+i);
		}

	}

}
