import java.util.Scanner;
class ReverseAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Starting Char :- "); 
        char Start = sc.next().charAt(0);
        System.out.println("Please Enter Ending Char :- ");
        char End = sc.next().charAt(0);
        int count = 0;
        while (Start >= End ){
            System.out.print(" Reversed "+Start);
            --Start;
            count++;
        }
        
        System.out.println("The Total Numbers Are : "+ count);
    }
}