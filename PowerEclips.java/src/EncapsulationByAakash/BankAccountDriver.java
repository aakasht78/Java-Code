package EncapsulationByAakash;
import java.util.Scanner;
public class BankAccountDriver {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

		 BankAccount b = new BankAccount("Aakash", 123456, 1234,"150XYZ",5500.00);
		 
		 
		 System.out.println("Namaskar..... Welcome To My Bank");
		 System.out.println("What You Want To Do ?");
		 System.out.println(" 1.Want To Withdraw \n 2.Want To Deposite \n 3.Want To Set New Pin \n 4.Want To Check Balance");
		 int What = sc.nextInt();

		 
		 
		 switch(What) {
		 case 1:{
//			 User Input
			 System.out.println("Please Enter Account Number");
			 int accno = sc.nextInt();
			 		 
			 System.out.println("Please Enter Pin Number");
			 int pin = sc.nextInt();
			
			 System.out.println("How Much You Want To Withdraw");
			 double withdraw = sc.nextInt();
			 
			 b.withdraw(accno, pin, withdraw);
//			 b.withdraw(123456, 1234, 4000);
		  }
		 case 2:{
//			 User Input
			 System.out.println("Please Enter Account Number");
			 int accno = sc.nextInt();
			 		 
			 System.out.println("Please Enter Pin Number");
			 int pin = sc.nextInt();
			
			 System.out.println("Please Enter The IFSC Code");
			 String ifsc = sc.next();
			 
			 System.out.println("How Much You Want To Deposite");
			 double deposite = sc.nextInt();
			 
			 b.depoite(accno, pin, ifsc, deposite);
//			 b.depoite(123456, 1234, "150XYZ", 10000);
		 }
		 case 3 :{
//			 User Input
			 System.out.println("Please Enter Account Number");
			 int accno = sc.nextInt();
			 
			 System.out.println("Please Enter Pin Number");
			 int pin = sc.nextInt();
			 
			 System.out.println("Please Enter NewPin Number");
			 int Newpin = sc.nextInt();
			 
			 
			 b.SetPin(accno, pin, Newpin);
//			 b.SetPin(123456, 1234, 1234);
		 }
		 case 4 :{
//			 User Input
			 System.out.println("Please Enter Account Number");
			 int accno = sc.nextInt();
			 		 
			 System.out.println("Please Enter Pin Number");
			 int pin = sc.nextInt();
			 
			 b.getBalance(accno, pin);
//			 b.getBalance(123456, 1234);
			
		 }
		 default:{
			 System.out.println("Invalid Please Select One Of The Showing Data");
		 }
		}

	}
}
