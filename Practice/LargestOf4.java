import java.util.Scanner;
public class LargestOf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter First Number :-");
        int a= sc.nextInt();
        System.out.println("Please Enter Second Number :-");
        int b= sc.nextInt();
        System.out.println("Please Enter Third Number :-");
        int c= sc.nextInt();
        System.out.println("Please Enter Fourth Number :-");
        int d= sc.nextInt();
        

        int Result = (a>b?a:b)>c?(a>b?a:b):(c>d?c:d)>d?(c>d?c:d):d;
        System.out.println(" The Largest Number is :- "+Result);
    }
}
