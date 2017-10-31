package com.ds.array;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] array = new int[][] {{1,2,3},
			{2,3,4},
			{5,3,4}};
			System.out.println(array.length);
		for(int i = 0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(array[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}

}
