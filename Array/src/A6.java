// Read 5 names of Bollywood Singers From Users
import java.util.Scanner;
class A6
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Element Of The Array");
        String[] name = new String[5];
        for(int i = 0; i<name.length; i++)
        {
            name[i] = s.next();
        }
        for(int i = 0; i<name.length; i++)
        {
            System.out.println(name[i]+ " ");
        }
        
    }
}