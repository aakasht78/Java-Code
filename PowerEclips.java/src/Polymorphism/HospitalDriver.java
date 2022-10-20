package Polymorphism;

public class HospitalDriver {
    public static void main(String[] args) {
        Hospital h = new HospitalFix();
        h.appointment("Aakash", "Rajan");
        h.prescription("Aakash", "fever", "Dolo", 650);
    }
}
