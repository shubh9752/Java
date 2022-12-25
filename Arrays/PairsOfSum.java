package Arrays;

import java.util.Scanner;

public class PairsOfSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in); 
	    int n=s.nextInt();
	    int[] arr= {1,3,6,4,5,8,12,1,7,2};
	    pairs(arr,n);

	}
	static void pairs(int[] arr,int n){
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==n) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
