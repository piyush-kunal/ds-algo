
public class LinearSearch {
	
	public static int linearSearching(int[] arr, int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int[] arr1 = {10,2,31,21,34,1,3};
		int searchKey = 34;
		System.out.println("Key"+searchKey+" found at index "+linearSearching(arr1, searchKey));
	}
}
