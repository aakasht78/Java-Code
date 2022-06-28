import java.util.Scanner;
class showroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Aakash Collection :)");
        System.out.println("Which Car You Want?");
        String Car = sc.next();
        switch (Car) {
            case "BMW":
            {
                System.out.println("We Have Best Models In BMW Is :-");
                System.out.println("BMW X7");
                System.out.println("Price :- 1.18 Crore");
                break;
            }
            case "Tesla":
            {
                System.out.println("We Have Best Models In Tesla Is :-");
                System.out.println("Tesla Model X");
                System.out.println("Price :- 2.00 Crore");
                break;
            } 
            case "Volvo":
            {
                System.out.println("We Have Best Models In Volvo Is :-");
                System.out.println("Volvo XC90");
                System.out.println("93.90 Lakh - 1.31 Crore");
                break;
            }
            case "Jaguar":
            {
                System.out.println("We Have Best Models In Jaguar Is :-");
                System.out.println("Jaguar F-Pace");
                System.out.println("1.51 Crore");
                break;
            }
            case "Bugatti":
            {
                System.out.println("We Have Best Models In Bugatti Is :-");
                System.out.println("Bugatti Divo");
                System.out.println("41.00 Crore");
                break;
            }
            
            default:
            System.out.println(" Brand Is Not Avilable :(..... \n WE Have Only \n Bugatti \n Jaguar \n Volvo \n Tesla \n BMW");
                
        }

    }
}
