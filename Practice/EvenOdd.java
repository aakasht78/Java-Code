import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number :- ");
        int Number = sc.nextInt();
        if (Number%2 ==0) {
            System.out.println(Number + " Is Even Number");
        } else {
            System.out.println(Number + " Is Odd Number");
        }
    }
}
