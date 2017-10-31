
public class MissingNumber {
	
	static int arr[] = {1,2,4,5,6,7,8};
	
//	int getMissingNo(int arr[], int n) {
//		int total;
//		total = (n+1)*(n+2)/2;
//		for(int i=0; i<n; i++) {
//			total -= arr[i];
//		}
//		return total;
//	}
	
	//XOR Method
	int getMissingNo(int arr[], int n) {
		int i; int x1 = arr[0]; int x2 = 1;
		
		for(i=1; i<n; i++) {
			x1 = x1^arr[i];
		}
		for(i=2; i<=n+1; i++) {
			x2 = x2^i;
		}
		
		return (x1^x2);
	}
	
	public static void main(String... args) {
		MissingNumber obj = new MissingNumber();
		System.out.println(obj.getMissingNo(arr, arr.length));
	}

}
