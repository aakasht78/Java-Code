// Fibonacci Program 
class Fibonacci {
    public static void main(String[] args) {
        int num = 0;
        int a = 0;
        int b = 1;
        int c;
        while (num<10) {
            c=a+b;
            System.out.print(" "+a);
            a=b;
            b=c;
            num++;
        }
    }
}
