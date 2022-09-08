package Encapsulation;

public class BankAccount {
	
	private String Name;
	private String BName;
	private long AccountNo;
	private String Ifsc;
	private int pin;
	private long phno;
	private String Address;
	private double Balance;
	
	BankAccount(){
		
	}
	BankAccount(String Name,String BName,long AccountNo,String Ifsc,int pin,long phno,String Address,double Balance)
	{
		this.Name=Name;
		this.BName=BName;
		this.AccountNo=AccountNo;
		this.Ifsc=Ifsc;
		this.pin=pin;
		this.phno=phno;
		this.Address=Address;
		this.Balance=Balance;
	}
	public String getName()
	{
		return Name;
	}
	public String getBName()
	{
		return BName;
	}
	public long getAccountNo()
	{
		return AccountNo;
	}
	public String getIfsc()
	{
		return Ifsc;
	}
	public String getAddress()
	{
		return Address;
	}
	public void Withdraw(long AccountNo,int pin,double Money)
	{
		if(AccountNo==this.AccountNo && pin==this.pin)
		{
			System.out.println("Login SuccessFul");
			if((Balance-Money)>1000)
			{
				Balance-=Money;
				System.out.println("Money Debited!");
				System.out.println("Your Updated Balance:"+Balance);
			}
			else
			{
				System.out.println("Insufficient Balance");
			}
		}
		else
		{
			System.out.println("Invalid Account Details!");
		}
	}
	public void Deposit(long AccountNo,int pin,double Money)
	{
		if(AccountNo==this.AccountNo && pin==this.pin)
		{
			System.out.println("Login Success!");
			Balance+=Money;
			System.out.println("Money Credited !");
			System.out.println("Your Balance:"+Balance);
		}
		else
		{
			System.out.println("Invalid Account Details !");
		}
	}
	public void Setpin(long AccountNo,int pin,long phno,int newpin)
	{
		if(AccountNo==this.AccountNo && pin==this.pin && phno==this.phno)
		{
			System.out.println("Login Success !");
			pin=newpin;
			System.out.println("Pin Changed");
		}
	}
}
