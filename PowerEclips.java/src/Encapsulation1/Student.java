package Encapsulation1;

public class Student {
	String name;
	int age;
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		if(age>10 && age<20)
		{
			System.out.println("your eligible for these School");
		}
		else
		{
			this.age = age;
		}
		
	}
	
	
	 
}
