import java.util.Scanner;
public class SumOfEnteredNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Starting Number :- ");
        int start = sc.nextInt();
        System.out.println("Please Enter The Ending Number :-  ");
        int end = sc.nextInt();
        int sum = 0;
            for(int w = start; w<=end; w++){
                sum = w + sum;
                
            }
            System.out.println(sum);
    }
}
