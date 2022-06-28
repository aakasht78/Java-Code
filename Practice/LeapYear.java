import java.util.Scanner;
 class LeapYear {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter a year! :- ");
        int Year = Sc.nextInt();
        if (Year%4==0 && Year%100 !=0) {
            System.out.println("Year is a leap Year");
        } else {
            System.out.println("Year is Not a Leap Year");
        }
    }
}
