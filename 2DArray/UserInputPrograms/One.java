/*   1. Create a 2D String array by reading size of rows and columns from the 
   user ,initialize the values for the array created and print the matrix 
*/
import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        char[][]a = new char[row][col];

        for(int i = 0;i<a.length;i++){
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.next().charAt(0);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
