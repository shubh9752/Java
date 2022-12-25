package javaprogrammes;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int div=2;
//		boolean isPrime=true;
//		while(div<=n/2) {
//			if (n%div==0 || n==2) {
//				isPrime=false;
//			}
//			div++;
//		}
//		if(isPrime) {
//			System.out.println("prime number");
//		}else {
//			System.out.println("composite number");
//		}
// 2nd method using return:
		while(div<=n-1) {
			if((n%div==0 || n==2)) {
			System.out.println("composite");
			return;
			}
			div++;
		}
		System.out.println("prime");
	}

}
