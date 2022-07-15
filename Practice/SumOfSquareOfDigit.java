import java.util.Scanner;
class SumOfSquareOfDigit {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter The Number");
       int num = sc.nextInt();
       int sum = 0;
       while(num!=0){
        int rem = num%10;
        rem=rem*rem;
        sum=rem+sum;
        num/=10;
       }
       System.out.println("The Sum Of Square Number Is "+sum);
    }
}
