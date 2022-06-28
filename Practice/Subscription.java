import java.util.Scanner;
class Subscription {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Welcome VKPrime ");
        System.out.println("Your Name :- ");
        String Name = Sc.next();
        System.out.println("Plese Enter Your Email :- ");
        String Mail = Sc.next();
        System.out.println("Please Enter Password :- ");
        String Pass = Sc.next();
        System.out.println("Have Coupen Code ? :- ");
        int Coupen = Sc.nextInt();
        int days = 0;
        do {
           
            if (Coupen == 3333) {
                System.out.println("Your Free Subsicription Starting Now");
                break;
            }
            else {
                System.out.println("Invalid Coupen");
            }
            
           
        } 
       
        while (days < 4); 
        days++;
        if (days == 3) {
           System.out.println("Maximum attempt reachead......!!!");
           System.out.println("Please Pay If You Want !!!!");
        }
        System.out.println("Thankyou !!!!");
        
    }
}
