import java.util.Scanner;
class CountEvenNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Start Number");
        int Start = sc.nextInt();
        System.out.println("Please Enter End Number");
        int End = sc.nextInt();
        int Count=0;
        while (Start<=End) {
            if (Start%2==0) {
                Count++;
            }
            Start++;
        }
        System.out.println(Count);
    }
}
