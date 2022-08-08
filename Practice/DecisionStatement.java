import java.util.Scanner;
public class DecisionStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Percentage (%) :- ");
        double per = sc.nextDouble();

        if (per >0 && per >= 85 && per <= 100) {
            System.out.println("Out Standing");
        }
        else if (per >= 65 && per < 85){
            System.out.println("A");
        }
        else if(per >= 35 && per < 65){
            System.out.println("pass");
        }
        else if(per > 100 || per < 0){
            System.out.println("Invalid percentage");
        }
        else{
            System.out.println("failed");
        }
    }
}
