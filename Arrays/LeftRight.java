package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr=new int[n];
		int[] arr1=result(arr,n);
		System.out.println(Arrays.toString(arr1));

	}
	static int[] result(int[] arr,int n) {
		int left=0;
		int right=n-1;
		int counter=1;
		for(int i=0;i<n;i++) {
			if(counter%2==1) {
				arr[left]=counter;
				counter++;
				left++;
			}else {
				arr[right]=counter;
				counter++;
				right--;
			}
		}
		return arr;
	}

}
