public class Teacher extends Person{
	double salary;
	String subject;
	Teacher(String name,String dateOfBirth,double salary,String subject){
		super(name,dateOfBirth);
		this.salary=salary;
		this.subject=subject;
	}
	

	public String getDetails() {
		return "Teacher Name: "+name+",DOB: "+dateOfBirth+",Salary: "+salary+",Subject Taken:"+subject;
	}
}
