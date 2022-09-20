package Exception1;
import java.util.Scanner;
public class Division {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no:");
	int n1= sc.nextInt();
	
	System.out.println("Enter the second no");
	
	int n2=sc.nextInt();
	try
	{
	  int ans=n1/n2;
	  System.out.println(ans);
		
	}
	
	catch (ArithmeticException e) {
		System.out.println("please dont divided a number by zero");
	}
	
	System.out.println("Thank you !");
	
}
}
