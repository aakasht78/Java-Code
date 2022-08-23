class Sum 
{
 public static void main (String args[])
{
  int num=32146;
  int sum=0;
  int sun1=0;
System.out.println("Num:"+num);
  while(num>0)
   {
      int rem=num%10;
     // System.out.println(rem);
       num/=10;
       if(rem%2==0)
         {
             // System.out.println(rem);
           sum=rem+sum;
         }
         else
           { 
             // System.out.println(rem);
             sun1=rem+sun1;
            }
       System.out.println("Sum of Enven no"+sum);
        System.out.println("Sum of odd no"+sun1);
     }

}
}