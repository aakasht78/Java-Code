import java.util.Scanner;
import javafx.scene.input.InputEvent;
public class ArrayProgramPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] a = new String [5];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextLine();
            } 
            for (int i = a.length-1;i>=0; i--) {
                System.out.print(a[i]+ " ");
            }       
    }
}
