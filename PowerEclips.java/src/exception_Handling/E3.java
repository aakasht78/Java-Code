package exception_Handling;

public class E3 {
    public static void main(String[] args) {
        
    System.out.println("Hi");
    try {
    exp();
 
    }
    catch(ArithmeticException a){
        System.out.println("don't divide a number by zero");
    }
    finally {
        System.out.println("Thankyou");
    }
   }
    public static void exp() {
        System.out.println("From exp()");
        int ans = 1/0;
        
       
    }
}
