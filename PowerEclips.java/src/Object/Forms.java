package Object;

public class Forms {
	String name;
	String dob;
	int age;
	String email;
	String address;
	long telno;
	String blood;
	
	Forms(){}
	
	Forms(String name, String dob, int age, String email){
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.email = email;
	}
	
	Forms(String name, String dob, int age, String email,String address){
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	
	Forms(String name, String dob, int age, String email,String address, long telno){
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.email = email;
		this.address = address;
		this.telno = telno;
	}	
	Forms(String name, String dob, int age, String email,String address, long telno, String blood){
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.email = email;
		this.address = address;
		this.telno = telno;
		this.blood = blood;
	}	
	
	public void Display() {
		System.out.println(name);
		System.out.println(dob);
		System.out.println(age);
		System.out.println(email);
		System.out.println(address);
		System.out.println(telno);
		System.out.println(blood);
	}
 
}
