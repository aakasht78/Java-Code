public class EvenIndex {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7};
        for (int i = 0; i < a.length; i++) {
            if (i%2==1) {
                System.out.print(a[i]+" ");
            }
        }
    }
}
