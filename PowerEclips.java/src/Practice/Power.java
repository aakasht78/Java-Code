package Practice;

public class Power {
	public static void Diplay(int base, int rasie) {
		int power = 1;
		for(int i = 0 ; i < rasie; i++) {
			power = power * base;
		}
		System.err.println(power);
	}
	public static void main(String[] args) {
		Diplay(3, 4);
	}
}
