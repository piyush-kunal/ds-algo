//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;

class Kadane {
    public static void main(String args[] ) throws Exception {
		
		 /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
         */
    	
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] inp=line.split(" ");
        int len=inp.length;
        
        int[] b=new int[len];
        for(int k=0;k<len;k++) {
        	b[k]=Integer.parseInt(inp[k]);
        }
        
        //int arr[] = new int[] {1, 4, -6, 8, 1, -4, 5, -3, 1, -1, 6, -5,9};
        
		int arr[]=new int[] {-10};
		arr=b;
		int n=arr.length;
		int[][] res=new int[2][n] ;
		int currentMaxindex=0;
		int currentMaxSum=arr[0];
		int endingIndex=0;
		res[0][0]=0;
		res[1][0]=arr[0];
		for(int i=1;i<n;i++) {
			int lasttrailingsum=res[1][i-1];
			int lastTrailingSumIndex=res[0][i-1];
			if(lasttrailingsum+arr[i]>arr[i]) {
				res[0][i]=lastTrailingSumIndex;
				res[1][i]=lasttrailingsum+arr[i];
			}else {
				res[0][i]=i;
				res[1][i]=arr[i];
			}
			
			if(currentMaxSum<res[1][i]) {
				currentMaxSum=res[1][i];
				currentMaxindex=res[0][i];
				endingIndex=i;
			}
		}
		for(int j=currentMaxindex;j<=endingIndex;j++) {
		    if(j==currentMaxindex)
			System.out.print(arr[j]);
			else if(j==endingIndex){
			    System.out.print(", "+arr[j]);
			}else 
			System.out.print(", "+arr[j]);
		}
		
	
    }
}
