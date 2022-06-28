class LargestOf4Char {
    public static void main(String[] args) {
        char a = 'y';
        char b = 'w';
        char c = 'x';
        char d = 'z';
            char result = (a>b?a:b)>c?(a>b?a:b):(c>d?c:d)>d?(c>d?c:d):d;
            System.out.println(result);
    }
}
