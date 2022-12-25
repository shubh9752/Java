package Patterns;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("star pattern");
		for(int i=0;i<n;i++) {
			// for star pattern:
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}


			System.out.println();
		}
		System.out.println("numer pattern 0");
		for(int i=1;i<=n;i++) {
			//for number pattern:
			for(int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("number pattern 1");
		for(int i=1;i<=n;i++) {
			//for number pattern 1:
			for(int j=1;j<=n;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println("number patter 2");
		for(int i=1;i<=n;i++) {
			//for number pattern 2:
			for(int j=1;j<=n;j++) {
				System.out.print(n-j+1);
			}
			System.out.println();
		}
		System.out.println("pattern3");
		int p=1;
		for(int i=1;i<=n;i++) {

			//for number pattern 1:
			for(int j=1;j<=n;j++) {
				System.out.print(p+" ");
				p++;
			}

			System.out.println();

		}
		System.out.println("pattern 4");
		for(int i=1;i<=n;i++) {
            int k=i;
			//for number pattern 1:
			for(int j=1;j<=n;j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		System.out.println("numer pattern 5");
		for(int i=1;i<=n;i++) {
			//for number pattern:
			for(int j=1;j<=n;j++) {
				System.out.print((char)('A'+j-1));
			}
			System.out.println();
		}
	}
}
