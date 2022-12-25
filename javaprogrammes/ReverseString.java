package javaprogrammes;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String name=s.next();
		int len=name.length();
		String rv="";
		for(int i=len-1;i>=0;i--) {
			rv=rv+name.charAt(i);
			
		}
		System.out.println(rv);

	}

}
