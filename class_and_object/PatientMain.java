import java.util.Scanner;

class Patient{
	private String patientname;
	private double height;
	private double weight;
	
	void setDetails(String patientname,double height,double weight) {
		this.patientname=patientname;
		this.height=height;
		this.weight=weight;
	}
	void calculateBMI() {
		double bmi=weight/(height*height);
		System.out.println("The BMI value of the patient "+patientname+" is "+bmi);
	}
}
public class PatientMain {
	public static void main(String[] args) {
		Patient p=new Patient();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the patientname,height(in metres) and weight(in kgs):");
		String name=sc.next();
		double height=sc.nextInt();
		double weight=sc.nextInt();
		p.setDetails(name,height,weight);
		p.calculateBMI();
		sc.close();
	}
}

// Design a class that can be used by a health care professional to keep track of a patient’s
// vital statistics. The following are the details.
// Name of the class - Patient
// Member Variables -
// patientName(String),height(double),width(double) Member Function - double
// computeBMI()
// The above method should compute the BMI and return the result. The formula for
// computation of BMI is weight (in kg) ÷ height*height(in metres).
// Create an object of the Patient class and check the results.