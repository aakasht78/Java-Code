import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Starting Number");
        int Start = sc.nextInt();
        System.out.println("Please Enter The Ending Number");
        int End = sc.nextInt();
        for(int w = Start; w>=End; --w ){
            System.out.print(" "+w);
        }
    }
}
