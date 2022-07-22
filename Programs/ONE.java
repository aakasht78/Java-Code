class ONE
{
    public static void main(String[] args) {
        int a= 5,b=3,c=10;
        b=a++ + ++c;
        a=++b - a--;
        c=c+ a++ +b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}