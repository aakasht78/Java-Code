package exception_Handling;
import java.util.Scanner;
public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the numerator");
        int h1 = sc.nextInt();
        
        System.out.println("Enter the denometor");
        int h2 = sc.nextInt();
        
        try {
        int res = h1/h2;
        System.out.println(res);
        }
        catch (ArithmeticException e) {
            System.out.println("Please Don't Divide a Number by Zero");
        }
        
        System.out.println("Thankyou");
    }
}
