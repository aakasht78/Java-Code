import java.util.Scanner;
public class Assingment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The First Number");
        int a = sc.nextInt();
        System.out.println("Enter The Second Number");
        int b = sc.nextInt();

        int c = a=b;
        int d = c+=b;
        int e = d-=b;
        int f = a*=b;
        int g = a/=b;
        int h = a%=b;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        
    }
}
