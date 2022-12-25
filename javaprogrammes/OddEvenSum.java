package javaprogrammes;

import java.util.Scanner;

public class OddEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int odd,even;
		odd=0;
		even=0;
		for(int i=0;n>0;n=n/10) {
			int last=n%10;
			if(last%2==0) {
				even=even+last;
			}else {
				odd=odd+last;
			}
			
		}
		System.out.println("even sum "+even +" "+"odd sum "+ odd);

	}

}
