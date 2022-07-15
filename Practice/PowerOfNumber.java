import java.util.Scanner;
class PowerOfNumber {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Base Number");
    int base = sc.nextInt();
    System.out.println("Enter The Raise Number");
    int raise = sc.nextInt();
    int power=1;
    for(int i=1;i<=raise;i++){
        power=power*base;
    }
    System.out.println("The Power Of " + base+" base " +" "+ raise +" raise "+" is " + power);
    if(power%2==0){
        System.out.println("Power Is Even Number");
    }
    else{
        System.out.println("Power Is Odd Number");
    }
   } 
}
