package Practice;
import java.util.Scanner;
public class EcommerceStore {
	public static void EStore() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Welcome To Estoren Created By Aakash!!!");
		System.out.println("\t \t  Here You Will Get What Ever You Want !");
		
	
		
		System.out.println(" \n Which Item You Want To See ?  ");
		String Product =  sc.next();
		
		switch(Product) {
			case "Laptop":{
				System.out.println("Which Laptop You Want ?");
//				

				System.out.println("Hp");
				System.out.println("Lenovo");
				System.out.println("OnePlus");
				System.out.println("Apple");
			}
		}
		
		
		
	}	
	public static void main(String[] args) {
		EStore();
	}
}
