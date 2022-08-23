import java.util.Scanner;
class Pincheak
{
 public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
 int pin=7171;
 int start=1; 
 
  do{
       System.out.println("Enter the your password");
	int pass= sc.nextInt();
              if(pass==pin)
	{
                     System.out.println("valid password");

	}
	else
	{
	  System.out.println("Invalid password");
	
	}
	start++;
     }
 
 while(start<3);
	if(start==3)
                   {
		System.out.println("Maimum attent rech");
	}
	else
	{
		System.out.println("Thankyou");
	}

}
}
  