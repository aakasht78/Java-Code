package exception_Handling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exp1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        try {
        
        System.out.println("Enter the size of Array");
        int size = s.nextInt();
        
        int[] a = new int[size];
        
        System.out.println("Array Creaated SuccessFully");
        
        System.out.println("Enter the elements to the Array");
        for (int i = 0; i < a.length; i++) {
            a[i]=s.nextInt();
        }
        
          System.out.println("Element Stored");
          System.out.println("Enter the First Index");
          int i1 = s.nextInt();

          System.out.println("Enter the Second Index");
          int i2 = s.nextInt();
        
        
          int ans = a[i1]/a[i2];
        
        ;  System.out.println(ans);
        }
        catch(InputMismatchException i) {
            System.out.println("Please Enter the valid input");
        }
        catch(ArithmeticException e) {
            System.out.println("Don't Divide a Number by zero");
        }
        catch(Exception f) {
            System.out.println("Somthing Is Wrong \n Please Contact A Developer");
        }
        finally {
            System.out.println("Thankyou");
        }
    }
}
