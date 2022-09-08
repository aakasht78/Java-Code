package Practice;

public class ArmStrong {
	
	public static void main(String[] args) {
		int num=1;
		int cube=0;
		int temp=num;
		while(num>0)
		{
			int rem=num%10;
			num=num/10;
			cube= cube+(rem*rem*rem);
		}
		if(temp==cube)
		{
			System.out.println("it is aramstrong no");
		}
		else
		{
			System.out.println("it is not aramstrong ");
		}
	}

}
