package Encapsulation2;

public class student {
	
	private  String name;
	private int rollno;
	private long phono;
	 private String add;
	
	student(){}
	
	
	student(String name,int rollno,long phono,String add)
	{
		this.name=name;
		this.rollno=rollno;
		this.phono=phono;
		this.add=add;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getRollno()
	{
		return rollno;
	}
	
	public long getPhono()
	{
		return phono;
	}
	
	public  String getAdd()
	{
		return add;
	}
	
	public void setrollno(int rollno)
	{
		if(this.rollno==rollno || rollno>60)
		{
			System.out.println("Hii From If Block");
			System.out.println(this.getRollno());
		}
		else
		{
			System.out.println("Hiii From else Block");
			
		}
		
	}

}
