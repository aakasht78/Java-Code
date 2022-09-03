package Practice;

public class LargestOfTwo {
	public static void Largest(int a, int b) {
		int result = a>b ? a:b;
		System.out.println("Largest of two is :- "+ result);
	}
	public static void main(String[] args) {
		Largest(10, 20);
	}
}
