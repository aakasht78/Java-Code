import java.util.Scanner;
class BloodDonation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Homoglobin :-  ");
        int Count = sc.nextInt();
        if (Count >= 12) {
            System.out.println("Please Donate !..");
        } else {
            System.out.println("Please Don't Donate....... if You Want it we Will Give You");
        }
    }
}
