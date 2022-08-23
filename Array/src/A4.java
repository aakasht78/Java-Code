import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Enter " + a.length + " elements");
        for(int i = 0 ; i< a.length; i++){
            a[i]=S.nextInt();
            System.out.println(a[i]);
        }
        for(int i = 0 ; i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        
    }
}
