// incomplete Code
import java.util.Scanner;
class ParaAcceptDatatype {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Byte();
        Short();
        Data(1, 'a', 55555l);
    }    
    public static void Byte() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Byte Number");
        Byte a = sc.nextByte();
        double op =a;
        System.out.println("Double output :-"+ op);
    }
    public static void Short() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Short Number");
        Short a = sc.nextShort();
        double op =a;
        System.out.println("Double output :-"+ op);
    }
    public static void Data(int a, char b, long c) {
        double op =a;
        op =b;
        op =c;
        // op =d;
        System.out.println("Double output :-"+ op);
    }
    
}
