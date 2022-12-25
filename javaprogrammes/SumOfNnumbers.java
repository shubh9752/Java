package javaprogrammes;

import java.util.Scanner;

public class SumOfNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter a number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int sum=0;
		int i=1;
				while(i<=n) {
					sum=sum+i;
					i++;
				}
		System.out.println(sum);
	}

}
