package Practice;

public class StatIn1 {
	static int q = 1234;
	public static void main(String[] args) {
		System.out.println("from main method :-"+q);
		q=400;
		System.out.println("from main method :- "+q);
		
		demo();
		doo();
	}
	
	public static void demo() {
		System.out.println(q);
		q=50;
		System.out.println("from demo () :- "+q);
	}
	public static void doo() {
		System.out.println(q);
	}
}

