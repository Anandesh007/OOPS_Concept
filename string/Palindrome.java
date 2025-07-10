package string;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str1=sc.nextLine();
		String rev="";
		int n=str1.length();
		for(int i=n-1;i>=0;i--) {
			rev+=str1.charAt(i);
		}
		if(rev.equals(str1)) {
			System.out.println("It is Palidrome");
		}
		else {
			System.out.println("It is no a Palindrome");
		}
		sc.close();
	}
}
