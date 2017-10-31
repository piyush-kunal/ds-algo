// Iterative 
//public class GetSum {
//	public static void main(String args[]) {
//		int number = 124424;
//		int sum = 0;
//		while(number>0) {
//			sum += number%10;
//			number = number/10;	
//		}
//		System.out.println(sum);
//	}
//}

// Recursive
public class GetSum {
	public static int sumDigits(int num) {
		return num == 0 ? 0 : num%10 + sumDigits(num/10);
	}
	public static void main(String args[]) {
		System.out.println("Sum of Digits "+sumDigits(4123));
	}
}