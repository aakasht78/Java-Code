package Abstraction;

public class DellDriver {
    public static void main(String[] args) {
        Dell d1 = new windows();
        d1.welcome("Aakash");
        System.out.println(d1.calculator(10, 20));
        d1.notepad("hola hiookashhfsb dbsjodb sncshxncwehbdnxm,ccwdbh x");
        
        System.out.println("------------------------------------------");
        
        Dell d2 = new Linux();
        System.out.println(d2.calculator(10, 200));
        d2.notepad("kya baat hai");
    }
}
