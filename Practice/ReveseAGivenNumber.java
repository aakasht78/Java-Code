// Wap t Reverse a given Number
import java.util.Scanner;
public class ReveseAGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Number You Want To Revese :-");
        int num = sc.nextInt();
        while(num>0){
            int rem = num%10;
            num= num/10;
            System.out.print(rem);
        }
    }
}
