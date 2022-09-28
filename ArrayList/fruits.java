import java.util.ArrayList;
import java.util.Scanner;
public class fruits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList a = new ArrayList<>();
        System.out.println("Enter the fruit name :- ");
       try{
        for (int i = 0; i < 2; i++) {
            a.add(s.next());
        }
        System.out.println("Inserted");
        System.out.println("Enter the fruit to search");
        String input = s.next();
        if(a.contains(input)){
            a.remove(input);
            System.out.println(input + " removed from the shop");
            System.out.println("Updated Stock :-"+a);
        }
        else{
            System.out.println("Fruit not found or selled!!!!");
        }
    }
    catch(Exception e){
        System.out.println("Solve the error");
    }
    finally{
        System.out.println("Thankyou");
    }
        
    }
}
