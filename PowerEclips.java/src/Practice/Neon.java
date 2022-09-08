package Practice;
import java.util.Scanner;
public class Neon {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :- ");
		int num = sc.nextInt();		
		int square = num * num;
		int sum = 0;
		int temp = square;
		
		while(temp > 0) {
			int rem = temp % 10; 
			sum = sum + rem;
			temp /= 10;
		}
		if(sum==num) {
			System.out.println("It is an Neon Number. ");
		}
		else {
			System.out.println("It is not neon number.");
		}
		
	}
}

