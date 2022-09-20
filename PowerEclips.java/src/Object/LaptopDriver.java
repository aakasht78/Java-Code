package Object;

public class LaptopDriver {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Acer", 55000.00,"100 features",32.00,"4500-Mah","32Inch",8,500 );
		
//		l1.display();
		System.out.println("The Brand Is :- "+l1.brand);
		System.out.println("The Battry Is :- "+l1.battry);
		System.out.println("The Price Is :- $"+l1.price);
		System.out.println("The Ram Is :- "+l1.ram + "GB");
		System.out.println("The HardDisk Is :- "+l1.HardDisk + "GB");
		System.out.println("The features Is :- "+l1.features);
		System.out.println("The DisplaySize Is :- "+l1.displaySize);
		System.out.println("The Size Is :- "+l1.size);
	}
}
