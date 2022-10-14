// Remove char after taking User Input from String

import java.util.Scanner;
public class RemoveParticularChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String s1 = sc.nextLine();
        System.out.println("Enter the character to remove");
        char ch = sc.next().charAt(0);
        char[] s2= s1.toCharArray();

        for (int i = 0; i<=s2.length-1; i++) {
            if(ch==s2[i]){
                s2[i]= '0';
            }
            if(s2[i]!='0'){
                System.out.print(s2[i]);
            }
        }
    }
}
