public class EvenOddAlpha {
    public static void main(String[] args) {
        char Start = 'a';
        while (Start <= 'z') {
            if (Start %2 == 0) {
              System.out.println("The Even Alphabet is "+ Start);  
            }
            else
            {
                System.out.println("The Odd Alphabet is "+ Start);   
            }
            
            Start++;
        }
    }
}
