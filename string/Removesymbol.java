package string;

import java.util.Scanner;

public class Removesymbol {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str1=sc.nextLine();
		String result="";
		int n=str1.length();
		for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == '*') {
                continue;
            }
            if (i > 0 && str1.charAt(i) == '*') {
                continue;
            }
            if (i < str1.length() - 1 && str1.charAt(i) == '*') {
                continue; 
            }
            result+= str1.charAt(i); 
        }
		System.out.println(result);
		sc.close();
	}
}

//Write a Java program that accepts a string (with * in it). The program should return
//a new string in which the following characters are removed- *, the characters that are to
//the left and right of *
//Example1
//i/p:ab*cd
//o/p:ad
