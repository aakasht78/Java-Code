public class AddIonOfEvenAndOdd {
    public static void main(String[] args) {
        int num = 2134;
        int sum = 0;
        int sum1 = 0;

        int rem=num%10;
        num = num/10;
        if(rem%2==0){
            System.out.println(rem);
            sum=sum+rem;
        }
        else{
            System.out.println(rem);
            sum1=sum1+rem;
        }
        System.out.println(sum);
        System.out.println(sum1);
    }

}
