public class Employee extends Person {
	int annualsalary;
	int yearstarted;
	String insuranceno;
	
	Employee(String name,int annualsalary,String insuranceno,int yearstarted){
		super(name);
		this.annualsalary=annualsalary;
		this.insuranceno=insuranceno;
		this.yearstarted=yearstarted;
	}
	
	public void setsalary(int salary) {
		annualsalary=salary;
	}
	
	public void setstartedyear(int yearstarted) {
		this.yearstarted=yearstarted;
	}
	
	public void setinsurance( String insuranceno) {
		this.insuranceno=insuranceno;
	}
	
	public int getsalary() {
		return annualsalary;
	}
	
	public int setstartedyear() {
		return yearstarted;
	}
	
	public String setinsurance() {
		return insuranceno;
	}
	
	public String getDetails() {
		return "Employee: "+ name+",Salary: "+annualsalary+",Insurance number: "+insuranceno+",Started Year: "+yearstarted;
	}
}
