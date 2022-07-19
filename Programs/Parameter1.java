class Parameter1 {
    public static void power(int base, int raise){
        int pow = 1;
        for (int i = 0; i < raise; i++) {
            pow*=base;
        }
        System.out.println(pow);
    }
    public static void main(String[] args) {
        power(3,4);
        power(5+5,4);
        power(2*6/3,3);
    }
}
