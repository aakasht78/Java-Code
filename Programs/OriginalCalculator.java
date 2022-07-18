import java.util.Scanner;
class OriginalCalculator {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome To Calculator ");
        System.out.println("What You Want To Do");
        System.out.println(" 1.add "+"\n 2. sub "+"\n 3. div "+"\n 4. mul ");
        String Calculate = sc.next();
        switch(Calculate){
        case "add":
        {
            add();
            break;
        }
        case "sub":
        {
            sub();
            break;
        }
        case "div":
        {
            div();
            break;
        }
        case "mul":
        {
            mul();
            break;
        }
        default:
        {
            System.out.println("Wrong");
        }
      }
       
    }
    public static void add(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter The 1st Number");
        int a=sc.nextInt();
        System.out.println("Please Enter The 2nd Number");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("The Answer Is :- "+c);
        
    }
    public static void sub(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter The 1st Number");
        int a=sc.nextInt();
        System.out.println("Please Enter The 2nd Number");
        int b=sc.nextInt();
        int c=a-b;
        System.out.println("The Answer Is :- "+c);
    }
    public static void div(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter The 1st Number");
        int a=sc.nextInt();
        System.out.println("Please Enter The 2nd Number");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println("The Answer Is :- "+c);
    }
    public static void mul(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter The 1st Number");
        int a=sc.nextInt();
        System.out.println("Please Enter The 2nd Number");
        int b=sc.nextInt();
        int c=a*b;
        System.out.println("The Answer Is :- "+c);
    }
    
}
