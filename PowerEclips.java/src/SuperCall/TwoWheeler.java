package SuperCall;

public class TwoWheeler {
    int numberofWheels;
    int seat;
    
    
    TwoWheeler() {}

    TwoWheeler(int numberofWheels, int seat) {
        this.numberofWheels = numberofWheels;
        this.seat = seat;
    }
    
    public void DisplayTwoWheeler() {
        System.out.println(numberofWheels);
        System.out.println(seat);
    }
}
