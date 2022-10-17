package multiLevel_Inheritance;

public class AccountDriver {
    public static void main(String[] args) {    
        carLoan c = new carLoan("MH-12-3643", 200.00, 56, 12, 2.2, "Bike-loan", 1234567890l, "pune", "SBI", 1000.00, "xyz", 500000.00, 15);
//        c.DisplayAccount();
        c.DisplayLoanAccount();
    }
}
