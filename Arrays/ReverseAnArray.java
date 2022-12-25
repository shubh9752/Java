package Arrays;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,4};
		reverse(arr);
		int[] reverseArr=reverse1(arr);
		System.out.println(Arrays.toString(reverseArr));

	}
	static void reverse(int[] arr) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	//using two pointer method
	static int[] reverse1(int[] arr) {
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
		    arr[start]=arr[end];
		    arr[end]=temp;
		    start++;
		    end--;
			
		}
		return arr;
	}
	

}
