package EncapsulationByAakash;

public class BankAccount {
	 private String name;
	 private int accno;
	 private int pin;
	 private String ifsc;
	 private double balance;
	 
	 
	 BankAccount(){};
	
	 BankAccount(String name, int accno, int pin, String ifsc, double balance)
	 {
		 this.name = name;
		 this.accno = accno;
		 this.pin = pin;
		 this.ifsc = ifsc;
		 this.balance = balance;
	 }
	 public String getName() {
		 return name;
	 }
	 public int getAccno() {
		 return accno;
	 }
	 

	 
	 double money;
	 
	 public void withdraw(int accno, int pin,double money) {
		 if(accno == this.accno && pin == this.pin) {
			 System.out.println("Login Success");
			 if((balance -money)>=10) {
				 balance -= money;
				 System.out.println("Money Debited");
				 System.out.println("Your New Balnce Is :- "+" ₹"+balance);
			 }
			 else {
				 System.out.println("In Sufficient Balance");
				 System.out.println("You Have To Maintain Minimum of ₹1000");
			 }
		 }
		 else 
			 System.out.println("Invalid Account Details");
	 }
	 
	 public void depoite(int accno, int pin, String ifsc,double money) {
		 if(accno == this.accno && pin == this.pin && ifsc == this.ifsc) {
			 System.out.println("Login Success");
			 balance += money;
			 System.out.println("Money Is Credited");
			 System.out.println("Your New Balnce Is :- "+" ₹"+balance);
		 }
		 else 
			 System.out.println("Invalid Account Details");
	 }
	 
	 public String setIfsc() {
		 return ifsc;
	 }
	 
	 public void SetPin(int accno , int pin , int newpin) {
		 if(accno == this.accno && pin == this.pin) {
			 this.pin=newpin;
			 System.out.println("New Pin Is Suucessfully Updated ");
		 }
		 else {
			 System.out.println("Invalid Account Details");
		 }
	 }
	 public double getBalance(int accno, int pin) {
		 if(accno==this.accno && pin==this.pin) {
			 System.out.println("Login Success");
			 System.out.println("Your Balance Is "+"₹"+ balance);
			 return balance;
		 }
		 else {
			 System.out.println("Invalid Details");
			 return 0;
		 }
	 }
} 
