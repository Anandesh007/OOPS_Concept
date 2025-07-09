public class Student extends Person{
	int studentId;
	Student(String name,String dateOfBirth,int studentId){
		super(name,dateOfBirth);
		this.studentId=studentId;
	}

	public String getDetails() {
		return "Name: "+name+",DOB: "+dateOfBirth+",StudentId: "+studentId;
	}
}
