
package Array;
import java.util.Scanner;
public class UserArarray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int []a = new int[5];
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=s.nextInt();
			
			System.out.println(a[i]);
			
		}
	
	
	}

}
