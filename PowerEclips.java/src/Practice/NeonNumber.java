package Practice;
import java.util.Scanner;
public class NeonNumber {
	
	
	public static boolean IsNeon(int num) {
		int square = num * num;
		int sum = 0;
		int temp = square;
		
		while(temp>0) {
			int rem = temp % 10;
			sum = sum + rem;
			temp = temp / 10;
		}
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
		
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :- ");
		int num = sc.nextInt();
		
		if(IsNeon(num)) {
			System.out.println("It is neon number");
		}
		else {
			System.out.println("It is not neon number");
		}
		
				
	}
}
