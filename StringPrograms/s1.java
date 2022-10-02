public class s1 {
    public static void main(String[] args) {
       String s = "Aeroplane" ;

    //    System.out.println(s.charAt(3));
    //    System.out.println(s.concat(" Will Fly"));
    //    System.out.println(s.indexOf('a'));
    //    System.out.println(s.indexOf("o",3));

       String s2 = "e";

    //    System.out.println(s2.isEmpty());
    //    System.out.println(s.lastIndexOf('r'));
    //    System.out.println(s.length());

        // System.out.println(s.replace('A', 'B'));
        // System.out.println(s.substring(4));

        char [] c = s.toCharArray();
        for(int i =  0; i<c.length;i++){
            System.out.println(c[i]+" ");
        }
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        String a = "abc";
        System.out.println(a.trim());
    }

}
