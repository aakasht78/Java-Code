class CountAll_AToZ {
    public static void main(String[] args) {
        char Start = 'a';
        int Count = 0;
        while (Start <='z') {
            if (Start >= 'a') {
                Count++;
            }
            Start++;   
        }
         System.out.println(Count);
    }
}
