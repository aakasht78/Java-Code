public class Narrowing {
    public static void main(String[] args) {
        int i = (int)97.22;
        char c = (char) i;
        System.out.println(i);
        System.out.println(c);
    }    
}
