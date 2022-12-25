package javaprogrammes;

import java.util.Scanner;

public class FibinacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str;
		do {
			int n=s.nextInt();
			int a=0;
			int b=1;
			int c=0;
			for(int i=2;i<=n;i++) {
				c=a+b;
				a=b;
				b=c;
			}
			System.out.println(c);
			System.out.println("enter 'y' for yes to run program again");
			str=s.next();
		} while (str.equals("y")||(str.equals("Y")));

	}

}
