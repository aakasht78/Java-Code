import java.util.Scanner;

import java.util.Scanner;
class AlternateAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Starting Char :- ");
        char Start = sc.next().charAt(0);
        System.out.println("Please Enter Ending Char :- ");
        char End = sc.next().charAt(0);
        do {
            System.out.println(" " + Start);
            Start +=2 ;
        } while (Start <= End);
    }
}
