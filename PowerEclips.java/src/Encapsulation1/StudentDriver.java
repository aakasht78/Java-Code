package Encapsulation1;

public class StudentDriver {
	 public static void main(String[] args) {
		Student s = new Student();
	
		
		
		s.setAge(12);
//		System.out.println(s.getAge());
		
		s.setName("AAKASH");
		
		System.out.println("Name Is " + s.getName());
		System.out.println("Age Is " + s.getAge());
//		System.out.println(s.age);
//		System.out.println(s.Name);
	}
}
