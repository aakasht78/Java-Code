// Java Program To Capitalize First Letter In Each Word
import java.util.Scanner;
class CapitalizeF1stLetter{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.println("Enter The String");
        String s1 = s.nextLine();
        String[] s2 = s1.split(" ");
        for (int i = 0; i <=s2.length-1; i++) {
            String s3=s2[i].substring(0,1);
            String s4 = s2[i].substring(1);
            
            System.out.print(s3.toUpperCase()+"" + s4 + " ") ;
        }
}

}
