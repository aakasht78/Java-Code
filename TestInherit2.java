class Base 
{
    Base() 
    {
        System.out.println ("constructor of base");
    }
}

class Derived extends Base{
    Derived()
    {
        System.out.println ("constructor of Derived");
    }
}
class TestInherit2 
{
    public static void main(String [] args)
    {
        Derived obd = new Derived();
    }
}