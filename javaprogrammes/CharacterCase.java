//Write a program that takes a character as input and prints either 1, 0 or -1 according to the following rules.
//1, if the character is an uppercase alphabet (A - Z)
//0, if the character is a lowercase alphabet (a - z)
//-1, if the character is not an alphabet
//Input format :
//Single Character
//Output format :
//1 or 0 or -1
//Constraints :
//Input can be any character
//Sample Input 1 :
//v
//Sample Output 1 :
//0
//Sample Input 2 :
//V
//Sample Output 2 :
//1
//Sample Input 3 :
//#
//Sample Output 3 :
//-1


package javaprogrammes;

import java.util.Scanner;

public class CharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your name: ");
		Scanner s=new Scanner(System.in);
		String name=s.next();
		char ch=name.charAt(0);
		if (ch>='A' && ch<='Z') {
			System.out.println("1");
		}
		else if(ch>='a' && ch<='z') {
			System.out.println(0);
		}
		else {
			System.out.println(-1);
		}

	}

}
