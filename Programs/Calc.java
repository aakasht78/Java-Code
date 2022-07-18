import java.util.Scanner;
class Calc {    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter The 1st Number");
        int a = Sc.nextInt();
        System.out.println("what you want to do");
        String Calc = Sc.next();
        System.out.println("Enter The 2nd Number");
        int b = Sc.nextInt();
        int sum;
        int sub;
        int mul;
        int div;
        switch(Calc){
            case("+"):
            {
                sum=a+b;
                System.out.println("The Sum Is :- "+sum);
                break;
            }
            case("-"):
            {
                sub=a-b;
                System.out.println("The Substraction Is :- "+sub);
                break;
            }
            case("*"):
            {
                mul=a*b;
                System.out.println("The multiplication Is :- "+mul);
                break;
            }
            case("/"):
            {
                div=a/b;
                System.out.println("The Division Is :- "+div);
                break;
            }
            default:
            {
                System.out.println("invalid");
            }
            
        }
    }
}
