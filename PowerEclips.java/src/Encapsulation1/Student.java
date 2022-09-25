package Encapsulation1;

public class Student {
	private String Name;
	private int age;
	 
	 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 15 || age < 3) {
			System.out.println("Age is invalid for this class");
		}
		else {
		this.age = age;
		}
	}
	
	public void setName (String Name) {
		if(Name == "AAKASH") {
			System.out.println("Correct Name");
		}
		else 
			this.Name =Name;
	}
	public String getName() {
		return Name;
	}
	 
	 
}
