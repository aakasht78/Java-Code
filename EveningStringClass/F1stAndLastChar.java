// Swap 1st and last char of String
import java.util.Scanner;
public class F1stAndLastChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The String");
        String s1 = s.nextLine();
        String[] s2 = s1.split(" ");
        for (int i = 0; i <=s2.length-1; i++) {
            char[] ch = s2[i].toCharArray();
            char temp=ch[0];
            ch[0]=ch[ch.length-1];
            ch[ch.length-1]=temp;
            for (int j = 0; j <=ch.length-1; j++) {
                System.out.print(ch[j]);
            }
            System.out.print(" ");
        }
}
}