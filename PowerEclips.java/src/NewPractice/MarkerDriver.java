package NewPractice;

public class MarkerDriver {
    public static void main(String[] args) {
        
        
        Marker m = new Marker("classmate", "black", 15);
        Marker m1 = new Marker("classmate", "black", 15);
        
        m.displayMarker();
        System.out.println("from m1 "+m1.brand);
    }
}
