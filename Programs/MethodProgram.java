import java.util.Scanner;
public class MethodProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Aakash Code");
        System.out.println("Choose What You Want To Do ? \n 1. Reverse \n 2. Power \n 3. Factorial");
        String Ques = sc.next();
            switch (Ques) {
                case ("1"):
                    {
                        Reverse();
                        break;
                    }
                case ("2"):
                    {
                        Power();
                        break;
                    }
                case ("3"):
                    {
                        Factorial();
                        break;
                    }
                    
                default:{
                    System.out.println("Invalid Input");
                    break;
                }
                    
            }        
    }
    public static void Reverse(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Which You Want Reverse It");
        int num = sc.nextInt();
        int rev = 0;
        while (num!=0) {
            int rem = num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Output :- "+rev);
    }
    public static void Power(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter The Base");
      int base =sc.nextInt();
      System.out.println("Enter The Raise");
      int raise =sc.nextInt();
      int power = 1;
      for(int i = 1; i<=raise; i++)
      {
        power=power*base;
      }
      System.out.println("Output :- "+power);
    }
    public static void Factorial(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter The Number");
      int num = sc.nextInt();
      int fact = 1;
      while (num > 0) {
       fact = fact*num;
       num--;
      }
      System.out.println("Output :- "+fact);
    }
    
}
