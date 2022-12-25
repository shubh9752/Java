package Functions;

import java.util.Scanner;

public class Isprime {
	static boolean isPrime(int n) {
		int original=n;
		boolean Prime=true;
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				return false;
			}
			
		}
		return Prime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(isPrime(n));
		System.out.println("list of all 2 digit prime numbers");
		for(int i=2;i<100;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		

	}

}
