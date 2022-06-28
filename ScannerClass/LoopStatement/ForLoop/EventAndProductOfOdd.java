import java.util.Scanner;
public class EventAndProductOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Starting Number :- ");
        int Start = sc.nextInt();
        System.out.println("Enter The Ending Number :- ");
        int End = sc.nextInt();
        int sum = 0;
        int product = 1;
        
        for (int w = Start; w <=End; w++) {
            if (w%2==0) {
                sum = sum+w;
            } else {
                product*=w;
            }
        }
        System.out.println("The Sum Of Even Number Between " + Start +  " To End " + End + " is " + sum);
        System.out.println("The Multiplication Of All Odd Number Between " + Start +  " To End " + End + " is " + product);
    }
}
