public class Two {
    public static void main(String[] args) {
        int a =10 , b = 17, c = 26;

        c=++a - c--;
        b=--c + ++b;
        c= --a + b++;
        System.out.println("a "+a);
        System.out.println("b "+b);
        System.out.println("c "+c);
    }
}
