package string;

import java.util.Scanner;
public class Shortlong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str1=sc.next();
		String str2=sc.next();
		if(str1.length()>str2.length()) {
			System.out.println(str2+str1+str2);
		}
		else {
			System.out.println(str1+str2+str1);
		}
		sc.close();
	}
}
