// Reverse String Using String Method 
import java.util.Scanner;
public class RevStringUsingStringMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String s1 = sc.nextLine(); 
        
        StringBuilder s = new StringBuilder(s1);
        System.out.println(s.reverse());

    }
}
