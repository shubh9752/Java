package javaprogrammes;

import java.util.Scanner;

public class ListofPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if (count==1) {
				System.out.println(i);
			}
		}

	}

}