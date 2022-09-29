public class AllPatterns {
    public static void main(String[] args) {
        int n=10;  //rows
        Pattern4(n);
        // Pattern2(n);
}
// ######################### Pattern-1  #######################################
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
// ######################### Pattern-1 Ends ######################################


// ######################### Pattern-2  #######################################

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
   // ######################### Pattern-2 Ends  #################################


// ######################### Pattern-3  #######################################

   public static void Pattern3(int n){
   for(int i=0;i<=4;i++){
    for (int j = 0; j < n-i; j++) {
        System.out.print("*" + " ");
    }
    System.out.println();
   }
  }

/*
    * * * *
    * * * 
    * * 
    *   
 */
// ######################### Pattern-3 Ends  #################################

// ######################### Pattern-4  ######################################



  public static void Pattern4(int n){

    for (int i = 1; i<=n; i++) {
        for (int space=1; space<=n-i; space++) {
            System.out.print(" ");
        }
            for (int j= 1 ; j<=2*i-1; j++) {
                System.out.print("&");
            }
            System.out.println();
        }
    }
  
/* 
          *
         ***
        *****
       *******
*/
// ######################### Pattern-4 Ends  #################################

}
