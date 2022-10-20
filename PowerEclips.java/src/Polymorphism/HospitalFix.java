package Polymorphism;

public class HospitalFix extends Hospital{
    public void prescription(String name, String Problem, String Tablet, int dosage) {
        System.out.println("Patient Name Is :- "+name);
        System.out.println("Patient Problem Is :- "+Problem);
        System.out.println("Patient Have To Take This Tablets :- "+Tablet);
        System.out.println("Dosage "+dosage);
    }
}
