// WAP to sum of Eeven and product of odd 
import java.util.Scanner;
public class ProductOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Starting Number :-");
        int Start = sc.nextInt();
        System.out.println("Please Enter The Ending Number :-");
        int End = sc.nextInt();
        int sum = 0;
        int product = 1;
        for(int w = Start; w<= End; w++){
            if(w%2==0){
                sum = sum+w;
            }
            else{
                product = w*product;
            }
        }
        System.out.println(sum);
        System.out.println(product);

    }
}
