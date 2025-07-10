package string;

import java.util.Scanner;

public class ConcatWithLowercase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strings:");
		String str1=sc.nextLine().toLowerCase();
		String str2=sc.nextLine().toLowerCase();
		
		if(str1.charAt(str1.length()-1)==str2.charAt(0)) {
			String str3=str1+str2.substring(1);
			System.out.println(str3);
		}
		else {
			System.out.println(str1+" "+str2);
		}
		sc.close();
	}
}

//Write a java program that will concatenate 2 strings and return the result. The result
//should be in lowercase.
//Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
//Example1)
//i/p:Sachin,Tendulkar
//o/p:sachin tendulkar
//Example2)
//i/p:Mark,kate
//o/p:markate