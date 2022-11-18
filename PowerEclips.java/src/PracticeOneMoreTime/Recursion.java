package PracticeOneMoreTime;

public class Recursion {
    public static void main(String[] args) {
        int a = 12;
        System.out.println(num(a));
    }
    public static int num(int a) {
        if(a==0) {
            return 0;
        }
        else {
            System.out.println(num(a-1));
            return a;
        }
    }
}
