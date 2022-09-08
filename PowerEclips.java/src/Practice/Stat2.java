package Practice;

public class Stat2 {
	static double d ; 
	public static void main(String[] args) {
		char d = 's';
		System.out.println(Stat2.d);
		System.out.println("calling from main method demo( )"+demo());
	}
	
	public static String demo() {
		System.out.println(d);
		String d = "Hello";
		System.out.println(Stat2.d);
		return d;
	}
}
