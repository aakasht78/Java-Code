package Practice;

public class Alphabet {
	public static void Display (char a) {
		int start = a;
		if (start >= 97 && start <= 122) {
			System.out.println("it is an lower case alphabet");
		}
		else if(start >= 65 && start < 97 ) {
			System.out.println("It is UpperCase Letter");
		}
		else if(start >= 48 && start <=57 ) {
			System.out.println("It is an digit");
		}
		else  {
			System.out.println("It is an Special char");
		}
	
	}
	public static void main(String[] args) {
		Display('h');
	}
}