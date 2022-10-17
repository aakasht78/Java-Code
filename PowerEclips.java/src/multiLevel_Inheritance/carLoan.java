package multiLevel_Inheritance;

public class carLoan extends LoanAccount {
    String carno;
    double price;
    int duration;
    double roi;
    
    carLoan(){}
    
    carLoan(String carno, double price, int duration, double roi, double emi , String name, long phno, String address, String bank, double balance, String type, double loanAmount, double cibil){
       this.carno = carno;
       this.price = price;
       this.duration = duration;
       this.roi = roi;
       this.name = name;
       this.phno = phno;
       this.address = address;
       this.bank=bank;
       this.balance = balance;
       this.type=type;
       this.loanAmount = loanAmount;
       this.emi = emi;
       this.cibil = cibil;
    }
    
    public void displayCarLoan() {
        DisplayAccount();
        DisplayLoanAccount();
        System.out.println(carno);
        System.out.println(price);
        System.out.println(duration);
        System.out.println(roi);
    }
}
