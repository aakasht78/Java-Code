// Split Word To Sentance
import java.util.Scanner;
public class SplitWordToSentance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        String[] s2 = s.split(" ");
        System.out.println(s2);
        for (int i = 0; i <=s2.length-1; i++) {
                String s3 = s2[i];
                System.out.println(s3);
        }

    }
}
