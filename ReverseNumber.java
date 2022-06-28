class ReverseNumber {
    public static void main(String[] args) {
        int sum =2134;
       
        while (sum > 0) {
            int rem = sum %10;
            System.out.print(rem);
            sum = sum / 10;
        }
    }
}
