class Grand 
{
    int a;
    Grand(int x)
    {
        a=x;
    }
    void show()
    {
        System.out.println(a);
    }
}
class Father extends Grand
{
    int b;
    Father(int x, int y)
    {
        Super(x);
        b=y;
    }
    void show b()
    {
        show a ();
        System.out.println(b);
    }
}
class child extends Father 
{
    int c;
    child(int x, int y, int z)
    {
        Super(x,y);
        c=z;
    }
    void show c ()
    {
        show b ();
        System.out.println(c);
    }
}
class TestInheritance4
{
    public static void main(String [] args) {
        child obc = new child(10,20,30);
        obc show();
        
    }
}