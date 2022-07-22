public class MethodReturnType 
{
    public static double MmToCm(double MM)
    {
        double Cm=MM/10;

        return Cm;
    }
    public static double CmToInch(double Cm)
    {
        double Inch=Cm*0.393701;

        return Inch;
    }
    public static double CmToFoot(double Cm)
    {
        double Foot=Cm*0.0328084;

        return Foot;
    }
    public static double InchToKiloMetre(double Inch)
    {
        double KiloMetre=Inch/39370.1;

        return KiloMetre;
    }
    public static void main(String[] args) 
    {
        double Cm=MmToCm(10);
        System.out.println("The Cm Value is:"+Cm);

        double Inch=CmToInch(Cm);
        System.out.println("THe Inch value is:"+Inch);

        double Foot=CmToFoot(Cm);
        System.out.println("The Foot Value is: "+Foot);

        double KiloMetre=InchToKiloMetre(Inch);
        System.out.println("The Km Value is:"+KiloMetre); 
    }
    
}