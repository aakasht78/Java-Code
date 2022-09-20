package Object;

public class BookDriver {
	public static void main(String[] args) {
		Book b1=new Book();
		System.out.println(b1);
		
		b1.brand = "classMate";
		b1.price = 75;
		b1.range = 260;
		b1.Size = "A4";
		b1.bind = "Soft Bind";
		
		
		
		System.out.println(b1.brand);
		System.out.println(b1.price);
		System.out.println(b1.range);
		System.out.println(b1.Size);
		System.out.println(b1.bind);
		System.out.println("======================");
		
		Book b2 = new Book();
		
		b2.brand = "Apple";
		b2.price = 450;
		b2.range = 560;
		b2.Size = "A4";
		b2.bind = "Hard Bind";
		
		
		System.out.println(b2.brand);
		System.out.println(b2.price);
		System.out.println(b2.range);
		System.out.println(b2.Size);
		System.out.println(b2.bind);
		
	}
}
