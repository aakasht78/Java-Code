package Practice;

public class AsciValue {
	public static void Display(char a, char b) {
		int start = a;
		int end = b;
		
		for (int i = start; i<=end;i++) {
			if(i>= start && i<= end) {
				System.out.print(" " + i);
			}
		}
	}
	public static void main(String[] args) {
		Display('a', 'e');
	}
}
