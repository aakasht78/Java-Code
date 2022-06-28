import java.util.Scanner;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int pin = 1233;
        System.out.println("Enter The Password");
        int ip = sc.nextInt();
        for (int start = 0; start < 3; start++) {
            if (ip==pin) {
                System.out.println("Logged In!");
                break;
            } else {
                System.out.println("Inccorect Password!!!");
            }
            if (start ==3 ) {
                System.out.println("Maximum Attempt Reachead");
            }
            System.out.println("thank you");
        }
    }
}
