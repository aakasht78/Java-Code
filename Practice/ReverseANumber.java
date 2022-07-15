public class ReverseANumber {
    public static void main(String[] args) {
      int num = 1234;
      int rev = 0;
      while(num!=0)
      {
        int rem = num%10;
        rem = rev*10+rem;
        num=num/10;
    }
}
}