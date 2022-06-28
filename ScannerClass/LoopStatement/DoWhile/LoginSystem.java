import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 123;
        int start = 0;
        do {
            System.out.println("Enter The Password :- ");
            int ip = sc.nextInt();
            if(ip == pin)
            {
                System.out.println("Logged In !");
                break;
            }
            else {
                System.out.println("Inccorect Password");
            }
            start++;
        } while (start < 3);
        if (start == 3) {
            System.out.println("maximum attempts reached !!!!");
        }
        System.out.println("Thankyou");
       

    }
}
