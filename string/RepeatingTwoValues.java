package string;

import java.util.Scanner;

public class RepeatingTwoValues {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str1=sc.nextLine();
		String str2=str1.substring(0,2);
		for(int i=0;i<str1.length();i++) {
			System.out.print(str2);
		}
		sc.close();
	}
}

//Given a string, return a new string made of 'n' copies of the first 2 chars of the original
//string where 'n' is the length of the string.
//Example1)
//i/p:Wipro
//o/p:WiWiWiWiWi