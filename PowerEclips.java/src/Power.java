import java.util.Iterator;

public class Power {
	public static void main(String[] args) {
		power(3,4);
	}
	public static void power(int base, int raise) {
		int power = 1;
		for(int i = 0; i< raise ; i++) {
			power = power* base;
		}
		System.out.println(power);
	}
	
}
