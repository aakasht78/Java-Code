package Practice;

public class PrimeWithMethod {
	
	public static void Prime(int a) {
		
		int num = a;
			int i;
			for(i =2; i< num; i++ ) {
				if(num%i==0) {
					break;
				}
			}
			if(i==num) {
				System.out.println(num + " it is prime number");
			}
			else {
				System.err.println(num + " It is not Prime Number");
			}
	} 

	public static void main(String[] args) {
		Prime(11);
	}
}
