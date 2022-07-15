public class CountDigitOfNumber {
    public static void main(String[] args) {
        int num = 123456789;
        int sum =0;
        int Count = 0;
        while(num!=0){
            int rem = num%10;   
            sum=sum+rem; 
            num/=10;    
            Count++; 
        }
        System.out.println(Count);        
    }
}
