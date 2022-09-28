public class jaggedArray {
    public static void main(String[] args) {
        int [][] a= {{10,20}, {10 }, {10,20,30}}; //jagged array
       
       for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            System.out.print(a[i][j] + " ");
            // System.out.println(a[i] [1]);
        }
        System.out.println();
       }
       /*  OutPut
       10 20
       10
       10 20 30 
       */
 }
}
