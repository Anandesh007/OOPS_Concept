package string;

import java.util.Scanner;

public class OddLengthOfString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str1=sc.nextLine();
		int n=str1.length();
		if(n%2==0) {
			System.out.println(str1.substring(0,n/2));
		}
		else {
			System.out.println("null");
		}
		sc.close();
	}
}
