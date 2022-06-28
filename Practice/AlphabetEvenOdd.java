public class AlphabetEvenOdd {
    public static void main(String[] args) {
        char start = 'a';
        while(start <='z'){
            if (start %2==0) {
                System.out.println(start +" Is Even Alphabet ");
            }
            else{
                System.out.println(start + " Is odd Alphabet ");
            }
            start++;
        }
    }
}
