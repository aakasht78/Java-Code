class widening1
{
    public static void main(String [] args)
    {
        byte b = 10;
        short s = b;
        int i = s;
        char c = i;
        long l = c;
        float f = l;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(c);
        System.out.println(l);
        System.out.println(f);

    }
}