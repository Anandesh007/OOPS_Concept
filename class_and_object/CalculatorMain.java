import java.util.Scanner;

class Calculator{
	static int powerInt(int num1,int num2) {
		int power=(int) Math.pow(num1,num2);
		return power;
	}
	static double powerDouble(double num1,double num2) {
		double power=Math.pow(num1,num2);
		return power;
	}
}
public class CalculatorMain {
	public static void  main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(Calculator.powerInt(num1,num2));
		System.out.println(Calculator.powerDouble(num1,num2));
		sc.close();
	}
}

// Create a new class called Calculator with the following methods:
// 1. A static method called powerInt(int num1,int num2)
// This method should return num1 to the power num2.
// 2. A static method called powerDouble(double num1,int num2).
// This method should return num1 to the power num2.
// 3. Invoke both the methods and test the functionalities.
// Hint: Use Math.pow(double,double) to calculate the power.
