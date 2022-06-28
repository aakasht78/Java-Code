import java.util.Scanner;
public class Tourism {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Welcom To Aakash Tours (:......");
        System.out.println("Where You Want Go?");
        String Place = Sc.next();
        switch (Place) {
            case "Pune":
            {
                System.out.println("Best Place To Visit In Pune Is:- ");
                System.out.println("Shaniwar Wada");
                System.out.println("Aga Khan Palace");
                System.out.println("Katraj Snake Park");
                System.out.println("Osho Ashram");
                break;
            }   
            case "Mumbai":
            {
                System.out.println("Best Place To Visit In Mumbai Is:- ");
                System.out.println("Gateway Of India");
                System.out.println("Marine Drive");
                System.out.println("Elephanta Caves");
                System.out.println("Chhatrapati Shivaji Maharaj Terminus");
                break;
            }   
            case "Kerala":
            {
                System.out.println("Best Place To Visit In Kerala Is:- ");
                System.out.println("Eravikulam National Park");
                System.out.println("Sree Padmanabhaswamy");
                System.out.println("Athirappilly Water Falls");
                System.out.println("Varkala Beach");
                break;
            }   
            case "Uttarakhand":
            {
                System.out.println("Best Place To Visit In Uttarakhand Is:- ");
                System.out.println("Valley of Flowers National Park");
                System.out.println("Rajaji National Park");
                System.out.println("Har Ki Pauri Ghat, Haridwar");
                System.out.println("Nainital Lake");
                break;
            }   
                  
        
            default:
            {
                System.out.println("No Data Avilable");
            }
            
        }
    }
}
