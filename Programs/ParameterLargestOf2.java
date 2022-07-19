// Largest Of 2 Using Parameter
class ParameterLargestOf2
{
    public static void Largest(int a, int b){
        int result = a>b ?a:b;
        System.out.println("Largest Is :-" +result);
    }
    
    public static void main(String[] args) {
        Largest(8, 5);
    }
}