
package Project;
import java.util.Scanner;
public class LibraryDriver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("==============Dashbord===============");
        System.out.println("Welcome To AXZ Librar");
//        (==================LoginDashboard==================)
        System.out.println(" \n 1. Login \n 2. Register");
        int F1st = s.nextInt();
        switch (F1st) {
            case 1:
                System.out.println("Hello From 1");
                break;
            case 2:
                System.out.println("Hello From 2");
                break;

            default:
                System.out.println("Invalid");
                break;
        }
        
//      (=================End_LoginDashboard==================)
            
    }
}
