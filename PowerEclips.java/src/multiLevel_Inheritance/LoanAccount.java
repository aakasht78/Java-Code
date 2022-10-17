package multiLevel_Inheritance;

public class LoanAccount extends Account{
    String type;
    double loanAmount;
    double emi;
    double cibil;
    
    
    LoanAccount(){}
    
    LoanAccount(String name, long phno, String address, String bank, double balance, String type, double loanAmount, double emi, double cibil){
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
    
    public void DisplayLoanAccount() {  
        DisplayAccount();
        System.out.println(type);
        System.out.println(loanAmount);
        System.out.println(emi);
        System.out.println(cibil);
    }
       
}
