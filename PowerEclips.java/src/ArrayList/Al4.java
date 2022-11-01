package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Al4 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Fruits Name");
        for(int i = 0;i<1;i++) {
            a.add(sc.next());
        } 
        System.out.println("Fruits Stored");
        System.out.println("1. Want To Search \n 2.Want add More Fruits");
        int What = sc.nextInt();
        
        switch (What) {
            case 1: {
                System.out.println("Enter The Fruit Name ");
                if(a.contains(sc.next())) {
                    System.out.println("Fruit Founded");
                }
                else {
                    System.out.println("Not Founded");
                }
                break;
            }
            case 2 :{
                while( true ) {

                    System.out.println("Enter The Fruit Name ");
                    a.add(sc.next());
                    System.out.println("Fruit Added");
                    
                    System.out.println("Want to add more Fruits Yes / No? ");
                    String more = sc.next();
                  
                    switch (more) {
                        case "Yes": {
                            System.out.println("Enter The Fruit Name ");
                            a.add(sc.next());
                            System.out.println("Fruit Added");
                            
                            System.out.println("Want to add more Fruits Yes / No? ");
                            String more1 = sc.next();
                            {
                                System.out.println("Enter The Fruit Name ");
                                a.add(sc.next());
                                System.out.println("Fruit Added");
                            }
                        }
                        default:
                            throw new IllegalArgumentException("Unexpected value: " + more);
                    }
                    
                }
            
            }
            default:
                System.out.println("Not Found");
        }
    }
}
