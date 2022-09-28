public class AllPatterns {
    public static void main(String[] args) {

        int n=4;
        Pattern1(n);
        // Pattern2(n);

}
    public static void Pattern1(int n){
    for (int i = 1; i <n; i++) {
        for (int j = 0; j <=n; j++) {
            System.out.print("#"+" ");
        }
        System.out.println();
    }

/*     FirstPattern
 *     # # # # 
 *     # # # # 
 *     # # # # 
 *     # # # # 
 *  
 */
   } 


   public static void Pattern2(int n){
    for(int i =1;i<=n;i++){
        for(int j = 1; j<=i;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
/*     SecondPattern

       * 
 *     * * 
 *     * * * 
 *     * * * * 
 *  
 */
   }
}
