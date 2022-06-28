import javax.naming.spi.DirStateFactory.Result;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 100;
        int b = 50;
        int c = 30;

        int Result = (a>b?a:b)>c?(a>b?a:b):c;
        System.out.println(Result);
    }
}
