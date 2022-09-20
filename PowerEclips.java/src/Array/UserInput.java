package Array;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the size of array:- ");
	int size = sc.nextInt();
	try {
	char [] a = new char[size];
	a[0] = 'a';
	a[1] = 'a';
	a[2] = 'k';
	a[3] = 'a';
	a[4] = 's';
	a[5] = 'h';
	
	for (int i = 0; i<a.length; i++) {
		System.out.print(a[i]);
	}
	}
	catch(ArrayIndexOutOfBoundsException a) {
		System.out.println("Please Enter Valid data");
	}
	
//	System.out.println("arry size is :-"+a.length);
	}
	
	
}
