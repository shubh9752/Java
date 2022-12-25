package Patterns;

import java.util.Scanner;

public class leftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("pattern 0");
		for(int i=0;i<n;i++) {

			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("pattern 1");
		for(int i=1;i<=n;i++) {

			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("pattern 2");
		for(int i=1;i<=n;i++) {

			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("pattern 3");
		int p=1;
		for(int i=1;i<=n;i++) {

			for(int j=1;j<=i;j++) {
				System.out.print(p);
				p++;
			}
			System.out.println();
		}
		System.out.println("pattern4");
		for(int i=1;i<=n;i++) {
			int k=i;

			for(int j=1;j<=i;j++) {
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
		System.out.println("pattern 5");

		for(int i=1;i<=n;i++) {
			int l=1;
			for(int j=i;j<=n;j++) {
				System.out.print(l);
				l++;
			}
			System.out.println();
		}
		System.out.println("pattern 5");

		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print((char)('A'+j-1));
			}
			System.out.println();
		}

	}

}
