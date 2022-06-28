import java.util.Scanner;
class LoginSyatemUsingDo {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int start = 0;
        do{
            System.out.println("Login Syatem !");
            System.out.println("Please Enter User ID :- ");
            int ID = Sc.nextInt(); 
            System.out.println("Please Enter Password :- ");
            int pass = Sc.nextInt(); 
            if (ID == 1234 && pass == 123){
                System.out.println("Logged In ");
                break;
            } 
            else {
                System.out.println("Invaild User Id Or Password");
            }
         start++;
        } while(start < 3 );
        if(start == 3)
        {
            System.out.println("Maximum Attempt Reached");
        }
        System.out.println("Thankyou!");
    }
}

