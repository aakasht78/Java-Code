public class A2 {
    // To declare and initilize statement
   public static void main(String[] args) {
    char [][] ch ={{'a','b','c'}, {'d','e','f'},{'g','h','i'} };

    for(int j = 0;j<ch[0].length;j++){
        // System.out.print(ch[0][j] + " ");
    }

    System.out.println( );
    // print all the element in 2nd row

    for (int i = 0; i < ch[1].length; i++) {
        // System.out.print(ch[1][i]+" ");
    }

    // print all the elements in 3rd row
    System.out.println( );
    for (int i = 0; i < ch[2].length; i++) {
        // System.out.print(ch[2][i]+" ");
    }



    
// ===================================================================
    // to print all the elements in matrix formats
    // one loop for rows
    // one loop for columns
// ===================================================================
    for (int i = 0; i < ch.length; i++) { //it gives no of row presents
        // Loop for columns
        for (int j = 0; j < ch[i].length; j++) { //it gives no of cols
            System.out.print(ch[i][j] + " ");
        }
        System.out.println( ); //new line
    }

   } 
}
