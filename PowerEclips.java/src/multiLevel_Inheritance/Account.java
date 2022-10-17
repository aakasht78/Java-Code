package multiLevel_Inheritance;

public class Account {
    String name;
    long phno;
    String address;
    String bank;
    double balance;
    
    Account(){}

    Account(String name, long phno, String address, String bank, double balance){
        this.name = name;
        this.phno = phno;
        this.address = address;
        this.bank=bank;
        this.balance = balance;
        }

    public void DisplayAccount() {
        System.out.println(name);
        System.out.println(phno);
        System.out.println(address);
        System.out.println(balance);
        System.out.println(bank);
        }
    
}
