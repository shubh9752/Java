package Functions;

import java.util.Scanner;

public class IsArmstrong {
	static boolean isArmstrong(int n) {
		int original=n;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			n=n/10;
			sum=sum+rem*rem*rem;
			
		}
		
		return sum==original;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(isArmstrong(n)); 
		System.out.println("list of 3digit Armstrong numbers");
		for (int i=1;i<1000;i++) {
			if(isArmstrong(i)) {
				System.out.println(i);
			}
		}
		
		
	}

}
