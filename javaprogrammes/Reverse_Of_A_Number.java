package javaprogrammes;

import java.util.Scanner;

public class Reverse_Of_A_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int rn=0;
		while(n>0) {
			rn=rn*10+n%10;
			n=n/10;
		}
		System.out.println(rn);
		

	}

}
