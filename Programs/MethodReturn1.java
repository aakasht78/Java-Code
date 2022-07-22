public class MethodReturn1 {
    
    public static double MmToCm(double MM){
        double CM = MM*0.1;
        return CM;
    }
    public static double CmToInch(double CM){
        double Inch = CM*0.393701;
        return Inch;
    }
    public static double CmToFoot(double CM){
        double Foot = CM*0.0328084;
        return Foot;
    }
    public static double InchToKm(double Inch){
        double KM = Inch/2.54e-5;
        return KM;
    }
    public static void main(String[] args) {
        double Cm=MmToCm(10);
        System.out.println(Cm);

        double Inch=CmToInch(Cm);
        System.out.println(Inch);

        double Foot=CmToFoot(Cm);
        System.out.println(Foot);

        double KiloMetre=InchToKm(Inch);
        System.out.println(KiloMetre);         
    }
}