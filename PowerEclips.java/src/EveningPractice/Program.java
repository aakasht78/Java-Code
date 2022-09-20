package EveningPractice;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Runs Of A");
		int ARun= sc.nextInt();
		System.out.println("Enter The Wickets Of A");
		int AWickets= sc.nextInt();
		System.out.println("Enter The Catches Of A");
		int ACatches= sc.nextInt();
		
		
		
		System.out.println("Enter The Runs Of B");
		int BRun= sc.nextInt();
		System.out.println("Enter The Wickets Of B");
		int BWickets= sc.nextInt();
		System.out.println("Enter The Catches Of B");
		int BCatches= sc.nextInt();
		

		
		int result = (ARun > BRun?ARun:BRun);
		
		System.out.println(result);
	
	}
		
		
	}
