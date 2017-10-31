// recusrsive
//public class BinarySearch {
//	
//	int binarySearchMethod(int arr[], int l, int r, int x) {
//		int mid = l + (r-l)/2;
//		if(r >= 1) {
//			if(arr[mid] == x) {
//				return mid;
//			}
//			if(arr[mid] > x) {
//				return binarySearchMethod(arr, l, mid-1, x);
//			}
//			if(arr[mid] < x) {
//				return binarySearchMethod(arr, mid+1, r, x);
//			}
//		}
//		
//		return -1;
//	}
//	
//	public static void main(String... args) {
//		BinarySearch bs = new BinarySearch();
//		int arr[] = {2,4,5,10,11,43,99,111,222};
//		int x = 5;
//		System.out.println(bs.binarySearchMethod(arr, 0, arr.length-1, x));
//	}
//
//}
//iterative
public class BinarySearch{
	int binarySearchMethod(int arr[], int x) {
		int l = 0; int r = arr.length -1; 
		int numberoftry = 0;
		while(l <=r) {
			int mid = l + (r-l)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]>x) {
				r = mid-1;
			}
			if(arr[mid] < x) {
				l = mid +1;
			}
			numberoftry++;
			
		}
		System.out.println(numberoftry);
		
		return -1;
	}
	public static void main(String... args) {
		BinarySearch bs = new BinarySearch();
		int arr[] = {222,223,331,332,441,443,551,552,662,664};
		int x = 551;
		System.out.println(bs.binarySearchMethod(arr, x));
	}
}
