public class FactorialOfArray {
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5};
        for(i =0; i<a.length;i++){
            System.out.println();
        }
    }
    public static int Factorial(int num){
        int fact = 1;
        for (int i = num; i >0; i--) {
            fact*=i;
        }
        return fact;


        
    }
}
