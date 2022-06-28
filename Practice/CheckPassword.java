import java.util.Scanner;
public class CheckPassword {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Please Enter The Password :- ");
        int pass = Sc.nextInt(); 
        if (pass == 1234) {
            System.out.println("Logged In! yaaaaaaa");
        } else {
            System.out.println("Inccorect Password ! Nooooooooooo");
        }
    }
}
