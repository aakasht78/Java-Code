import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Number On Remote");
        int Num = sc.nextInt();

        switch(Num){
            case 1:
            {
                System.out.println("you just pressed 1");
            }
            case 2:
            {
                System.out.println("You just pressed 2");
            }
            case 3:
            {
                System.out.println("You just pressed 3");
            }
            default:
            {
                System.out.println("invalid number");
            }
        }

      
    }
}
