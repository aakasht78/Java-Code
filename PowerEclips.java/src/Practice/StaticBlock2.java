// page number 151
package Practice;

public class StaticBlock2 {
	static double d;
	static
	{
	double d = a(10, 2 ) + b(100, 34);
	StaticBlock2.d = d + a(2,3);
	System.out.println("hi  "+d);
	System.out.println("hola"+StaticBlock2.d);
	}
	
	public static void main(String[] args) {
		double d = b(22, (int) StaticBlock2.d);
		System.out.println(d);
		System.out.println(StaticBlock2.d);
	}
	
	public static double a (double x, double y)
	{
		return x*y;
	}
	public static char b (int p , int q) {
		return(char) (p+q);
	}
}
