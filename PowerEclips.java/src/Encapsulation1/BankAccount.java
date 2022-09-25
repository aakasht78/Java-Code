package Encapsulation1;

public class BankAccount {
	private String name;
	private String user;	
	private int accno;
	private int pin;
	private long phno;
	private String address;
	private String ifsc;
	private double balance;
	
	
	BankAccount() {
		// TODO Auto-generated constructor stub
	}


	 BankAccount(String name, String user,int accno, int pin, long phno, String address, String ifsc, double balance) {
//		super();
		this.name = name;
		this.user = user;
		this.accno = accno;
		this.pin = pin;
		this.phno = phno;
		this.address = address;
		this.ifsc = ifsc;
		this.balance = balance;
	}
	
	 public String getName() {
		 return name;
	 }
	 public String getuser() {
		 return user;
	 }
	 public String getaccno() {
		 return user;
	 }
	 public long getphno() {
		 return phno;
	 }
	 public String getaddress() {
		 return address;
	 }
	 
	
	 public void withdraw(int accno, int pin, double money) {
		 if(accno==this.accno && pin==this.pin) {
			 System.out.println("Login Success");
			 if((balance-money)>=100){
				 balance-=money;
				 System.out.println("Money is debited!");
				 System.out.println("Your balance is :- "+balance);
			 }
			 else {
				 System.out.println("InSufficient balance"); 
				 System.out.println("You have to maintain minimum ₹1000");
			 }
		 }
		 else {
			 System.out.println("Invalid account details");
		 }
	 }
	 
	 public void deposite(int accno, int pin, double money) {
		 if(accno == this.accno && pin == this.pin) {
			 System.out.println("login success!");
			 balance += money;
			 System.out.println("money creditred");
			 System.out.println("Your balance is :- "+balance);
		 }
		 else {
			 System.out.println("Invalid account details");			 
		 }
	 }
	 
	 public String getifsc() {
		 return ifsc;
	 }
	 public void SetPin(int accno,long phno, int pin, int newPin ) {
		 if(this.accno ==accno && this.phno == phno && this.pin==pin) {
			 this.pin=newPin;
			 System.out.println("Success");
		 }
		 else {
			 System.out.println("Enter a valid account details!");
		 }
	 }
	 
	 public double getbalance(int accno,int pin) {
		 if(accno==this.accno && pin==this.pin) {
			 System.out.println("login success!");
			 return balance;
		 }
		 else {
			 System.out.println("Invalid Details");
			 return 0;
			 
		 }
	 }
}
