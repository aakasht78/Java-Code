package Object;
// Method Chaining
public class Mouse {
	String brand;
	double price;
	String color;
	
	public Mouse printBrand() {
		System.out.println(brand);
		return this;
	}
	public Mouse printPrice() {
		System.out.println(price);
		return this;
		}
	public Mouse printColor() {
		System.out.println(color);
		return this;
	}
}

//8 premetive
//1 void
//all not primitive 171