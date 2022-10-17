import java.util.*;
 public class Anagram {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter 2 String");
        String s1 = sc.nextLine();
        s1=s1.toLowerCase();
        String s2 = sc.nextLine();
        s2=s2.toLowerCase();
      
        if (s1.length()==s2.length()) {
            char[] ch1 = s1.toCharArray();
            char[] ch2 =s2.toCharArray();

            for (int i = 0; i < ch1.length-1; i++) {
               if (ch1[i]>ch1[i+1]) {
                char temp = ch1[i];
                ch1[i]=ch1[i+1];
                ch1[i+1]=temp;
               } 
            }
            for (int i1 = 0; i1 < ch1.length; i1++) {
                System.out.print(ch1[i1]);
            }
            System.out.println("\n");
// =======================================================================
            for (int i2 = 0; i2 < ch2.length-1; i2++) {
                if (ch2[i2]>ch2[i2+1]) {
                 char temp = ch2[i2];
                 ch2[i2]=ch2[i2+1];
                 ch2[i2+1]=temp;
                } 
             }
             for (int i3 = 0; i3 < ch1.length; i3++) {
                 System.out.print(ch2[i3]);
             }

             if (ch1[i1]==ch2[i3]) {
                System.out.println("anagram");
             }
             else{
                System.out.println("not an anagram");
             }
        } else {
            System.out.println("Length is not match hence it is not an anagram");
        }
    }
}









/*
 * //to check whether given strings are anagram or not 
 * import java.util.Scanner;
 *  class St20
 *  { 
 *      public static void main(String[] args) { 
 *      Scanner sc = new Scanner(System.in); '
 *      System.out.println("enter 2 strings:"); 
 *      String s1=sc.nextLine(); 
 *      s1=s1.toLowerCase(); 
 *      String s2=sc.nextLine(); 
 *      s2=s2.toLowerCase(); 
 *      if(s1.length()==s2.length()) 
 *      { 
 *       char[] ch1=s1.toCharArray(); 
 *       char[] ch2=s2.toCharArray(); 
 *       for(int i=0;i<ch1.length;i++)//sorting ch1 
 *        { 
 *          for(int j=0;j<ch1.length-i-1;j++) 
 *          {
 *             if(ch1[j]>ch1[j+1])
 *             { 
 *              char temp=ch1[j]; 
 *              ch1[j]=ch1[j+1];    
 *              ch1[j+1]=temp; 
 *              }
 *           } 
 *          }
 *           for(int i1=0;i1<ch1.length;i1++)//printing
 *                   { System.out.print(ch1[i1]); } 
 *                   System.out.println(" "); 
 *                   System.out.println("============================="); 
 *                   for(int i2=0;i2<ch2.length;i2++)//sorting ch2 
 *                    { for(int j2=0;j2<ch2.length-i2-1;j2++) 
 *                          { if(ch2[j2]>ch2[j2+1])
 *                               { char temp=ch2[j2]; 
 *                                  ch2[j2]=ch2[j2+1]; 
 *                                     ch2[j2+1]=temp; 
 *                                }
 *                           }
 *                     }
 *           for(int i3=0;i3<ch2.length;i3++)//printing ch2 
 *              { System.out.print(ch2[i3]); } 
 *                          System.out.println(" "); 
 *                        String s3=new String(ch1);
 *                           String s4=new String(ch2);
 *                           if(s3.equals(s4)) 
 *                            { System.out.println("anagram"); } 
                         else { System.out.println("not an anagram");
                         }
                         } 
                         else { System.out.println("length not matching hence not an anagram"); } } } 
 */