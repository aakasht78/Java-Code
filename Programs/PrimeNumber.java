// PrimeNumber Program
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :- ");
        int num = sc.nextInt();
        int i;
        for (i = 2; i < num; i++) {
            if (num%i==0) {
                break;
            }
        }
        if (i==num) {
            System.out.println("It Is Prime");
        }
        else{
            System.out.println("It Is Not Prime");
        }
    }
}
