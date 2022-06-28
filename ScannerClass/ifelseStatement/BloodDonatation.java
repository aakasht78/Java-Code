import java.util.Scanner;
class BloodDonatation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("main begins");
        System.out.println("Enter Your Homoglobin Count");
        int count = s.nextInt();
        if (count<12) {
            System.out.println("Dont Donate");
        }
        else
        {
            System.out.println("Please Donate");
        }
    }
}
