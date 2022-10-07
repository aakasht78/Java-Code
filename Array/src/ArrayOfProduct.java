public class ArrayOfProduct {
    public static void main(String[] args) {
        int prod = 1;
        int[] a = {1,2,3,4,5};
        for (int i = 0; i < a.length; i++) {
           prod *=a[i];
        }
        System.out.println(prod);
    }   
}
