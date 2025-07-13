package string;

import java.util.Scanner;

public class RemoveOccurence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        System.out.print("Enter string a: ");
        String str1 = sc.nextLine();

        System.out.print("Enter string b: ");
        String str2 = sc.nextLine();

        sc.close();

        StringBuilder result = new StringBuilder();
        int bLen = str2.length();

        for (int i = 0; i <= str1.length() - bLen; i++) {
            if (str1.substring(i, i + bLen).equals(str2)) {
                if (i > 0) {
                    result.append(str1.charAt(i - 1));
                }
                if (i + bLen < str1.length()) {
                    result.append(str1.charAt(i + bLen));
                }
            }
        }
        System.out.println("Output: " + result.toString());
        sc.close();
	}
}

//Given two strings a and b, return a new string, following the rules given below.
//If string b occurs in string a, then the new string should concatenate the characters that appear
//before and after of String b.
//Ignore cases where there is no character before or after the word, and a character may be
//included twice if it is in between two string b's.
//Example1
//i/p:abcXY123XYijk,XY
//o/p:c13i
//Example2
//i/p:XY123XY,XY
//o/p:13