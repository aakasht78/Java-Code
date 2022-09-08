package Practice;

public class StaticBlock1 {
	static 
	{
		for(int i = 0 ; i<5;i++) {
			System.out.println("From static block 1");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("From Main Method() ");
	}
	
	static 
	{
		System.out.println("From Static block 2");
	}
	
	static
	{
		System.out.println("From Static Block 3");
	}
}
