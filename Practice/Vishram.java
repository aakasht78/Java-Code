class Vishram {
    public static void main(String[] args) {
        int num = 153;
        while(num >0){
            int rem = num%10;
            System.out.print("reverse number :- " + rem);
            num /= 10;

            int square = 1;
            square = rem*rem;
            System.out.println("square number " + square);

            
            int fact;
            fact = square * square;
            System.out.println("fact is " +fact);
        }
    
    }
}
