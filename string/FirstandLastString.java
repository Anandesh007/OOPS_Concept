package string;

import java.util.Scanner;

public class FirstandLastString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str1=sc.nextLine();
		System.out.println("The new String is:"+str1.substring(1,str1.length()-1));
		sc.close();
	}
}
