// Mock Rating Program

import java.util.ArrayList;
import java.util.Scanner;
public class MockRating {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList a = new ArrayList<>();

        System.out.println("Enter the students mock ratings :-");
        for (int i = 0; i < 5; i++) {
            a.add(s.next());
        }
        System.out.println("Data Iserted");

        System.out.println("Search The Mock Ratings :-");
        String se = s.next();
        if(a.contains(se)){
            System.out.println("Founded Who Has " + se + " Ratings");
        }
        else
        {
            System.out.println("Not found");
        }
        System.out.println("Which Rating You Want To Remove ? ");
        String Remove = s.next();
        System.out.println(a);

        if(a.contains(Remove )){
            a.remove(Remove);
            System.out.println(Remove +" Data Removed !");
        }
        else{
            System.out.println("Not Found !");
        }
        
        System.out.println("Updated Stock :-"+a);
    }   
}
