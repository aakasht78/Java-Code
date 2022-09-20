package Object;

public class Marker {
	String brand;
	String color;
	double price;
	double size;
	String type;
	
	
	public Marker() {
		// TODO Auto-generated constructor stub
	}
	Marker(String brand,String color, double price, double size, String type){
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.size = size;
		this.type = type;
	}
	
	public void Display() {
		System.out.println(brand);
		System.out.println(color);
		System.out.println(price);
		System.out.println(size);
		System.out.println(type);
	}
}
