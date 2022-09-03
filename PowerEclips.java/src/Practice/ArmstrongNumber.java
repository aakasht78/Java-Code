package Practice;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :- ");
		int num = sc.nextInt();
		int cube = 0;
		int temp=num;
		int rem;
		
		while(num>0) {
			rem = num % 10;
			num=num/10;
			cube=cube+(rem*rem*rem);
		}
		if(temp==cube) {
			System.out.println("It is an armstrong number");
		}
		else {
			System.out.println("It is not armstrong number");
		}
	}
}
