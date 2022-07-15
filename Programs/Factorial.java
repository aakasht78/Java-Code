import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Please Enter The Number");
    int num = sc.nextInt();
    int fact = 1;
    while(num>0){
        fact = fact*num;
        num--;
    }
    System.out.println(fact);
    int rev = 0;
    while(fact!=0){
        int rem = fact%10;
        rev = rev*10+rem;
        fact = fact/10;
    }
    System.out.println(rev);
    if (rev%2==0) {
        System.out.println("Even");
    }
    else{
        System.out.println("odd");
    }
    }
}
