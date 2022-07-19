// WAP to design a method which accept a char value & prints whether it is an alphabet or a digit or special char
public class Assingment3 {
    public static void main(String[] args) {
        Date('1');
    }   
    public static void Date(char a) {
        int op =a;
        if (op>=97 && op<=122) {
            System.out.println("It Is An LowerCase Alphabet");
        } else if(op>=65 && op<=90){
            System.out.println("It is An UpperCase Alphabet");
        }
        else if (op>=48 && op<=57){
            System.out.println("It is an digit");
        }
        else{
            System.out.println("It Is An Special Charaecter");
        }
    } 
}
