class largestOf3No
{
    public static void main(String [] args)
    {
        int a = 10;
        int b = 20;
        int c = 30;

        // int large= a>b?a:b;
        // int largest= largest>c?large:c;
        // System.out.println(largest); //firstway
        // ===============================================================
        // int res =  a>b?(a>c?a:c) : (b>c?b:c); //second way
        //  System.out.println(res);
        // ===============================================================
        int ans = (a>b?a:b)>c?(a>b?a:b):c;
        System.out.println(ans);
    }
}