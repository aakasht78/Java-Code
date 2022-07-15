public class SumOfSquareOfDigit {
    public static void main(String[] args) {
        int num = 12;
        int sum =0;
        while(num!=0){
            int rem = num%10;
            rem=rem*rem;
            sum=rem+sum;
            num/=10;
        }
        System.out.println(sum);
    }
}
