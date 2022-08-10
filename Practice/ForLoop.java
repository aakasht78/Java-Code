import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Starting");
        int start = sc.nextInt();
        System.out.println("Please Enter The Ending");
        int End = sc.nextInt();
        
        int sum = 0;

        for(int w = start; w<=End; w++){
            sum = sum+w;
        }
        System.out.println(sum);

        
    }
}
