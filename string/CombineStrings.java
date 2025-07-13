package string;

import java.util.Scanner;

public class CombineStrings {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Two string:");
		String str1=sc.next();
		String str2=sc.next();
		StringBuilder str3=new StringBuilder();
		int n=Math.max(str1.length(),str2.length());
		for(int i=0;i<n;i++) {
			if(i<str1.length()) {
				str3.append(str1.charAt(i));
			}
			if(i<str1.length()){
				str3.append(str2.charAt(i));
			}
		}
		System.out.println(str3);
		sc.close();
	}
}

//Given two strings, a and b, print a new string which is made of the following
//combination-first character of a, the first character of b, second character of a, second
//character of b and so on. Any characters left, will go to the end of the result.
//Example1)
//i/p:Hello,World
//o/p:HWeolrllod