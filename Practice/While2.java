import java.util.Scanner;
class While2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Hello This Code Will Help You To Find All Even Number From Your Given Point To End Point :)");
        System.out.println("Please Enter Starting Number :- ");
        int Start = sc.nextInt();
        System.out.println("Please Enter Ending Number :- ");
        int End = sc.nextInt();
        int count = 0;
        while (Start <= End) {
            if (Start %2 == 0) {
                System.out.println("Even Numbers :-" + Start);
                count++;
            }
            Start++;
        }
        System.out.println("The Total Even Numbers Are "+ count);
    }
}