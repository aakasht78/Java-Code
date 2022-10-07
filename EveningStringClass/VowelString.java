// Programs To Find Vowels In The String
import java.util.Scanner;
public class VowelString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        String s1 = sc.nextLine();
        s1=s1.toLowerCase();
        int vcount = 0;
        int ccount = 0;
        int scount = 0;
        for (int i = 0; i <=s1.length()-1; i++) {
            if (s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
                vcount++;
            }
            else if(s1.charAt(i)!=' ')
            {
                ccount++;
            } 
            else if(s1.charAt(i)==' ')
            {
                scount++;
            }
        }
        System.out.println("Count of vowels is :- "+ vcount);
        System.out.println("Count of consonant is :- "+ ccount);
        System.out.println("Count of spaces is :- "+ scount);
       
    }
}
