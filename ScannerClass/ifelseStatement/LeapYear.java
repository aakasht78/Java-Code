import java.util.Scanner;
class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = s.nextInt();
        if ((year%4==0 && year%100 !=0) || (year % 400 == 0)) {
            System.out.println("It Is A leap Year");
        }
        else
        {
            System.out.println("It Is Not A leap Year");
        }
    }
}
