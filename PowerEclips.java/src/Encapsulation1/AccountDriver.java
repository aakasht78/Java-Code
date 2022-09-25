package Encapsulation1;

public class AccountDriver {
	public static void main(String[] args) {
		BankAccount b = new BankAccount("aakash","xyz",123456,1234,123456789l,"pune","z123",23000.00);
		System.out.println(b.getbalance(123456, 1234));
//		b.withdraw(123456, 1234, 1000);
//		b.SetPin(123456, 123456789, 1234, 1234);
		System.out.println(b.getbalance(123456, 1234));
//		b.deposite(123456, 1234, 7000.00);
	}
}

