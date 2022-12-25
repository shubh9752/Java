package Arrays;

import java.util.Scanner;

public class TripletSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr= {1,2,3,6,8,9,5,4,7,2,10};
		tripletSum(arr,n);

	}
	static void tripletSum(int[] arr,int n) {
		int count=0;
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==n) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}

}
