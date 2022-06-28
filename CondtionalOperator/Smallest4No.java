class Smallest4No {
   public static void main(String[] args) {
    int a = 500;
    int b = 200;
    int c = 10;
    int d = 49;

    int result = (a<b?a:b)<c?(a<c?a:c):(c<d?c:d)<d?(c<d?c:d):d;
    
    System.out.println(result);
   } 
}
