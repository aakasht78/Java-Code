import java.util.Scanner;
public class SumOfEnteredNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter The Number");
        int num = sc.nextInt();
        System.out.println("please Enter The Number");
        int End = sc.nextInt();
        int sum=0;
        for(int i = num; i<=End; i++){
            sum=sum+i;
            System.out.println(sum);
        }
    }
}
