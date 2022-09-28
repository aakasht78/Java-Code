package Pattern;

public class  NewPattern{
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=5;i++){
            for(int space = 1; space<=i-1;space++){
                for(int j= 1;j<=(i*2-1);j++){
                    System.out.print("* ");
                }
                System.out.println( );
            }
        }
    }
}
