package CustomeExceptions;

import java.util.Scanner;

public class MarriageBuro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Your Age");
        int age = sc.nextInt();
        
        if(age < 18) {
            throw new HaveSomePatience();
        }
        else if (age > 18 && age <40) {
            System.out.println("welcome to new life");
        }
        else if(age>40) {
            throw new Nouse();
        }
    }
}
