import java.util.Scanner;
class UserCount_aToz {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Please Enter Starting Character:-");
        char Start = Sc.next().charAt(0);
        System.out.println("Please Enter Ending Character:-");
        char End =Sc.next().charAt(0);
        int Count = 0;
        while (Start <= End) {
            if (Start >= 'a') {
                Count++;
            }
            Start++;
        }
        System.out.println("You Have Entered "+ Count + " Characters");
    }
    
}
