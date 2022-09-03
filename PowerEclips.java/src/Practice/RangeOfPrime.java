package Practice;

public class RangeOfPrime {
	public static void main(String[] args) {
		Pprime(1.0, 10.0);
	}
	public static void Pprime (double a, double b) {
		double start = a;
		double end = b;
		double i;
		for(i=start; i<=end; i++) {
			if(i%start==0) {
				break;
			}
			if(i==start) {
				System.out.println(start);
			}
			else {
				System.out.println("It is not prime");
			}
		}
	
	}
	
	
}
