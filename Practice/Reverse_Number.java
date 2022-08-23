public class Reverse_Number {
    public static void main(String[] args) {
        int num = 987654321;
        while(num>0){
            int rem = num %10;
            System.out.println(rem);
            num/=10;
        }
    }
}
