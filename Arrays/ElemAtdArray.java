package Arrays;

import java.util.Scanner;

public class ElemAtdArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{0,1,2,4},
				{12,54,94,5,0},
				{7,8,12,34,10,32}
		};
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		search(arr,n);

	}
	static void search(int[][] arr,int n) {
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				if(arr[row][col]==n) {
					System.out.println(row+", "+col);
					return;
				}
			}
		}System.out.println("element not found");
	}

}
