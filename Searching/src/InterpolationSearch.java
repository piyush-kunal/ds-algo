
public class InterpolationSearch {
	int binarySearchMethod(int arr[], int x) {
		int l = 0; int r = arr.length -1; 
		int numberoftry = 0;
		while(l <=r) {
			int mid = l + (r-l)/(arr[r]-arr[l]) * (x - arr[l]);
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
		InterpolationSearch bs = new InterpolationSearch();
		int arr[] = {222,223,331,332,441,443,551,552,662,664};
		int x = 551;
		int result = bs.binarySearchMethod(arr, x);
		System.out.println(result);
	}
}
