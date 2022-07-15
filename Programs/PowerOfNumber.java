public class PowerOfNumber {
    public static void main(String[] args) {
        int base = 3;
        int rasie = 4;
        int power = 1;
        for (int i = 1; i <=rasie; i++) {
            power=power*base;
        }
        System.out.println(power);
    }
}
