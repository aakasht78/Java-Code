public class FactorialOfNumber {
    public static void main(String[] args) {
        int fact = 1; 
        int num = 5;

        while (num>0) {
            fact=fact*num;
            num--;
        }
        System.out.println(fact);

    }
}
