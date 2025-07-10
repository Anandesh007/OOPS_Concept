package string;

import java.util.Scanner;

public class RemoveXcharacter {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String;");
		StringBuffer str1=new StringBuffer(sc.next());
		if(str1.charAt(0)=='x' || str1.charAt(0)=='x') {
			System.out.println(str1.substring(1,str1.length()-1));
		}
		else {
			System.out.println(str1);
		}
		sc.close();
	}
}
