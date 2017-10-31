
public class PrintNos {
	
	public static void printnum(int n) {
		if(n > 0) {
			printnum(n-1);
			System.out.println(n);
		}
		return;
	}
	
	public static void main(String... args) {
		
		printnum(20);
	}

}
