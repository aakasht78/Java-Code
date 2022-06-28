class widening4
{
    public static void main(String [] args)
    {
        char c = 'a';
        long l = c;
        float f = l;
        System.out.println(c);
        System.out.println(l);
        System.out.println(f);

    }
}