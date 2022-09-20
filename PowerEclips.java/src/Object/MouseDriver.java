package Object;

public class MouseDriver {
	public static void main(String[] args) {
		Mouse m1 = new Mouse();
		m1.color = "Black";
		m1.price = 200.20;
		m1.brand = "dell";
		
		m1.printColor().printPrice().printBrand();
	}
}
