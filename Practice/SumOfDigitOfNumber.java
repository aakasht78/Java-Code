public class SumOfDigitOfNumber {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0 ;
        int count = 0;
        while(num!=0){
            int rem = num % 10;
            num = num/10;
            sum = sum + rem;
            count++;
        }
        System.out.println(sum);
        System.out.println(count);
    }
}
