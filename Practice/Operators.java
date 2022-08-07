class Operators {
    public static void main(String[] args) {
        // Largest Of Two
       int a = 11, b=33, c=55, d=56;
       int res = (a>b?a:b)>c?(a>c?a:c):(c>d?c:d)>d?(c>d?c:d):d;
       System.out.println(res);
    }
}