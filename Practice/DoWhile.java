import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);      
        
        int start = 0;
        int pass = 123;

        do{
            System.out.println("Please Enter The Password");
            int pin = a.nextInt();

            if(pin==pass){
                System.out.println("You Entered Correct Password");
                break;  
            }
            else{
                System.out.println("Invalid Password");
            }
            start++;
        }
        while(start<3);
        if(start == 3) {
            System.out.println("Maximum Attempt Reachead");
        }
        else{
            System.out.println("Thankyou!");
        }
    }
}
