import java.util.Scanner;
 class Age
{
  public static void main(String args[])
  {
  
     Scanner sc= new Scanner(System.in);
     int  age=55;
     int start=1;
       do
            { 
               System.out.println("Enter your correct age:");
	int currect=sc.nextInt();
	   if(age==currect)
	     {
                          System.out.println("currect Age:");
	      }
                         else
	          {
 		 System.out.println("Error incurrect Age:");
 	            }
 	   start++;
  }
      while(start<=3);
	if(start==3)
	{
	      System.out.println("Maximum 3 time");
	}

	else
  	{
		 System.out.println("Thank you");
	}
                
}
}         