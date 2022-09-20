package Object;

public class Bottel {
	String brand;
	double price;
	String liters;
	String features;
	
	Bottel(){} // No argument constructor
	
	Bottel(String brand, double price, String liters, String features){  // Parameterized constructor
		this.brand = brand;
		this.price = price;
		this.liters = liters;
		this.features = features;
	}
	
	void Display() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(liters);
		System.out.println(features);
	}
	
	
	
	
	
}
