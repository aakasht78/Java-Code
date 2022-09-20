package Object;

public class Laptop {
	String brand;
	double price;
	String features;
	double size;
	String battry;
	String displaySize;
	int ram;
	int HardDisk;
	
	Laptop(){}
	
	
	Laptop(String brand,double price, String features, double size, String battry, 
			String displaySize, int ram, int HardDisk){
		this.brand = brand;
		this.price = price;
		this.features = features;
		this.size = size;
		this.battry = battry;
		this.displaySize = displaySize;
		this.ram = ram;
		this.HardDisk = HardDisk;
	}
	
	public void display() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(features);
		System.out.println(size);
		System.out.println(battry);
		System.out.println(displaySize);
		System.out.println(ram);
		System.out.println(HardDisk);
	} 
}
