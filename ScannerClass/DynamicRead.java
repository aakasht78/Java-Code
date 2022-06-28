import java.util.Scanner;
class DynamicRead {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Value Of Int");
        int a = sc.nextInt();
        System.out.println("Please Enter Value Of Boolean");
        boolean b = sc.nextBoolean();
        System.out.println("Please Enter Value Of Short");
        short s = sc.nextShort();
        System.out.println("Please Enter Value Of Long");
        long l = sc.nextLong();
        System.out.println("Please Enter Value Of Char");
        char sh = sc.next().charAt(0);
        System.out.println("Please Enter Value Of Float");
        float f = sc.nextFloat();
        System.out.println("Please Enter Value Of String");
        String Str = sc.next();
        
        System.out.println("You Entered Int:-"+a);
        System.out.println("You Entered Boolean:-"+b);
        System.out.println("You Entered Short:-"+s);
        System.out.println("You Entered Long:-"+l);
        System.out.println("You Entered Char:-"+sh);
        System.out.println("You Entered Boolean:-"+f);
        System.out.println("You Entered String:-"+Str);
        
    }
}
