public class SumOfEvenOddNumber {
   
        public static void main(String[] args) {
            int num = 1;
            int sum = 0;
            while (num>25) {
                if(num%2==0){
            System.out.println("Number Is Even");
            }
            else{
                System.out.println("Number Is Odd");
            }
            sum = sum + num;
            System.out.println(sum);
        }
    }
}
