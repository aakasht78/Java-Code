public class Power_Of_Number {
    public static void main(String[] args) {
        int base = 3;
        int raise = 4;
        int power = 1;
        for(int i = 1 ; i<raise; i++)
        {
            power=power * base;
        }
        System.out.println(power);
    }
}
