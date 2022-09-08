package Practice;

public class Stat1 {
	static int a= 5;
	static String s;
	static char c='c';
	static double d;
	static boolean b;
	
	
	public static void main(String[] args) {
		System.out.println(a); //5
		System.out.println(s); // null
		System.out.println(c); // c
		System.out.println(d); //0.0
		System.out.println(b); //false
		
		
		a();
	}
	
	public static void a() {
		System.out.println("============");
		System.out.println(a); // 5
	}
	
}
