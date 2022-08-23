import java.util.Scanner;
class SumOfEvenAndProductOffOdd {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Starting Number :- ");
    int start = sc.nextInt();
    System.out.println("Enter The Ending Number :- ");
    int End = sc.nextInt();
    int sum = 0;
    int prod = 1;
    for(int i = start; i<=End;i++){
        if(i%2==0){
            sum=sum+i;
        }
        else{
            prod*=i;
        }
        System.out.println("sum of even is :- "+ sum);
        System.out.println("Product of odd is :- "+ prod);
    }
   } 
}
