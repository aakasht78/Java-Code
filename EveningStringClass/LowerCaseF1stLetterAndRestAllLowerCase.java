// Java Program To Capitalize Rest Of All Letter In Each Word And Making First Letter Lowercase
import java.util.Scanner;
public class LowerCaseF1stLetterAndRestAllLowerCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.println("Enter The String");
            String s1 = s.nextLine();
            s1=s1.toUpperCase();
            String[] s2 = s1.split(" ");
            for (int i = 0; i <=s2.length-1; i++) {
                String s3=s2[i].substring(0,1);
                String s4 = s2[i].substring(1);
                
                System.out.print(s3.toLowerCase()+"" + s4 + " ") ;
            }
}
}
