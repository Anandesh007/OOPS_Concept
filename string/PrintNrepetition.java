package string;

import java.util.Scanner;

public class PrintNrepetition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String and number");
		
		try {
		String str1=sc.nextLine();
		int n=sc.nextInt();
		String result=str1.substring(n-1);
		for(int i=0;i<n;i++) {
			System.out.print(result);
		}
		}
		catch(Exception e) {
			System.out.println("Invalid input: "+e);
		}
		sc.close();
	}
}

//Given a string and an integer n, print a new string made of n repetitions of the last n
//characters of the string.
//You may assume that n is between 0 and the length of the string, inclusive.
//Example
//i/p:Wipro,3
//o/p:propropro