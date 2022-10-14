// Remove Duplicate Char From String

import java.util.Scanner;
public class RemoveDuplicateCharFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The String");
        String s1= sc.nextLine();
        int count = 0;
        char [] s2 = s1.toCharArray();
        for (int i = 0; i < s2.length-1; i++) {
            count = 1;
            for (int j = i+1; j <= s2.length-1; j++) {
                if (s2[i]==s2[j] && s2[i]!=' ') {
                    count++;
                    s2[j]=' ';
                }
            }
            if(count<=1 && s2[i]!=' '){
                System.out.print(s2[i]);
            }
        }
    }
    
}
