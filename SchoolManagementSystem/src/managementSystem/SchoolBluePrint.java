package managementSystem;

public class SchoolBluePrint {
	private String AdminName;
	private String AdminPass; 
	private int id ;
	private String StudentName;
	private int rollno;
	private int std;
	private String StudentPassword;
	
	
	SchoolBluePrint(){}
	
	
	public SchoolBluePrint(String adminName, String adminPass, int id, String studentName, int rollno, int std,
			String studentPassword) {
		AdminName = adminName;
		AdminPass = adminPass;
		this.id = id;
		StudentName = studentName;
		this.rollno = rollno;
		this.std = std;
		StudentPassword = studentPassword;
	}


	public String getAdminName() {
		return AdminName;
	}


	public void setAdminName(String adminName) {
		AdminName = adminName;
	}


	public String getAdminPass() {
		return AdminPass;
	}


	public void setAdminPass(String adminPass) {
		AdminPass = adminPass;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStudentName() {
		return StudentName;
	}


	public void setStudentName(String studentName) {
		StudentName = studentName;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public int getStd() {
		return std;
	}


	public void setStd(int std) {
		this.std = std;
	}


	public String getStudentPassword() {
		return StudentPassword;
	}


	public void setStudentPassword(String studentPassword) {
		StudentPassword = studentPassword;
	}

//	=======================================ADMIN LOGIN====================================================================
	public void AdminLogin() {
		if(AdminName == this.AdminName && AdminPass == this.AdminPass) {
			System.out.println("Login Successed");
		}
		else {
			System.out.println("Invalid....");
		}
	}
	
//	=======================================STUDENT LOGIN====================================================================
	public void StudentLogin() {
		if(StudentName == this.StudentName && StudentPassword == this.StudentPassword) {
			System.out.println("Login Successed");
		}
		else {
			System.out.println("Invalid....");
		}
	}
	
}
