class widening2
{
    public static void main(String [] args)
    {
        
        short s = 15;
        int i = s;
        char c = i;
        long l = c;
        float f = l;
        System.out.println(s);
        System.out.println(i);
        System.out.println(c);
        System.out.println(l);
        System.out.println(f);

    }
}