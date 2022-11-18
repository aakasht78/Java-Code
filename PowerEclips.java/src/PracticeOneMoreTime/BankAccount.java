package PracticeOneMoreTime;

public class BankAccount {
    private String name;
    private String user;
    private int accno;
    private int pin;
    private long phno;
    private String address; 
    private String ifsc;
    private double balance;
    
    BankAccount(){}
    BankAccount(String name,String user,int accno,String address, String ifsc, double balance,int pin,long phno){
        
        this.name=name;
        this.user=user;
        this.accno=accno;
        this.address =address;
        this.ifsc = ifsc;
        this.balance = balance;
        this.pin =pin;
        this.phno = phno;
    
    }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getUser() {
            return user;
        }
        public void setUser(String user) {
            this.user = user;
        }
        public int getAccno() {
            return accno;
        }
        public void setAccno(int accno) {
            this.accno = accno;
        }
        public long getPhno() {
            return phno;
        }
        public void setPhno(long phno) {
            this.phno = phno;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        
        public void withdraw(int accno, int pin, double money) {
            if(accno==this.accno && pin==this.pin) {
                if((balance - money)>=1000) {
                    balance-=money;
                    System.out.println("Money Debited");
                    System.out.println("Your new Balance is "+balance);
                }
                else {
                    System.out.println("insuffeciant balnce");
                }
            }
            else {
                System.out.println("invalid");
            }
        }
        
        
}
    