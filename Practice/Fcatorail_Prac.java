class Fcatorail_Prac{
    public static void main(String []args){
        int num = 5;
        int fact = 1;
        int sum = 0;
        while ( num >0 ){
            fact = fact * num;
            sum =sum+fact;
            num--;
        }

        System.out.println(sum)

    }
}
