class SmallestOf3Char {
    public static void main(String [] args) {
      char a = 'h';   
      char b = 'c';   
      char c = 'a';   

      String ans = (a<b?a:b)<c?(a<b?a+" is smallest":b+" is smallest"):c+" is smallest";
      System.out.println(ans);
    }
}
