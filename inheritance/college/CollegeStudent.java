public class CollegeStudent extends Student {
	String collegeName;
	int year;
	CollegeStudent(String name,String dateOfBirth,int studentId,String collegeName,int year){
		super(name,dateOfBirth,studentId);
		this.collegeName=collegeName;
		this.year=year;
	}
	public String getDetails() {
		return "Name: "+name+",DOB: "+dateOfBirth+",StudentId: "+studentId+",College Name: "+collegeName+",Studying year: "+year;
	}
	public static void main(String args[]) {
		Teacher t=new Teacher("Vishal","10/04/1987",15000.00,"Physics");
		Student s=new Student("Bharath","20/06/2004",1007);
		CollegeStudent c=new CollegeStudent("Vishnu","13/09/2000",1003,"Kongunadu College",4);
		System.out.println(t.getDetails());
		System.out.println(s.getDetails());
		System.out.println(c.getDetails());
	}
}
