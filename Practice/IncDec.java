import java.util.Scanner;
public class IncDec {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.print("A :- ");
    int a = sc.nextInt();
    System.out.print("B :- ");
    int b = sc.nextInt();
    System.out.print("C :- ");
    int c = sc.nextInt();
    System.out.print("D :- ");
    int d = sc.nextInt();
    System.out.print("E :- ");
    int e = sc.nextInt();
    

        e = e++ - d++;
        c++;
        --d;
        e++;
        b= ++a + b++;
        c= ++c + a++;
        a= ++b + --c;
        --b;
        --d;
        e++;
        b=e++ - --e; 

     System.out.println("=============Output============");
     System.out.println("a :-"+a);    
     System.out.println("b :-"+b);    
     System.out.println("c :-"+c);    
     System.out.println("d :-"+d);    
     System.out.println("e :-"+e);    
    }
}
