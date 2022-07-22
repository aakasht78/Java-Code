class ONE
{
    public static void main(String[] args) {
        int a= 10,b=23,c=3;
        a=b++ - ++c;
        b=--a - c--;
        c= c+ a++ + b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}