package Patterns;
import java.util.Scanner;
public class MirrorImage {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner s=new Scanner(System.in);
		int n=5;         //s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int spaces=1;spaces<=n-i;spaces++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			for(int k=0;k<i-1;k++) {
				System.out.print("*");
			}
			
			System.out.println("");
			
		}
		for (int i=1;i<=n-1;i++) {
			for(int spaces=0;spaces<=i-1;spaces++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<n-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int spaces=1;spaces<=n-i;spaces++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			for(int k=0;k<i-1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i=1;i<=n-1;i++) {
			for(int spaces=0;spaces<=i-1;spaces++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			for(int k=1;k<n-i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		


	}

}




