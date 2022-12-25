package javaprogrammes;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("enter power: ");
		int p=s.nextInt();
		int sum=1;
		for(int i=1;i<=p;i++) {
			sum=sum*n;
		}
		System.out.println(sum);

	}

}
