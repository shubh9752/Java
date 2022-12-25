package Arrays;

import java.util.Arrays;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,23,4,5,6,7,2};
		int[] swaparr=swapPair(arr);
		System.out.println(Arrays.toString(arr));

	}
	static int[] swapPair(int[] arr) {
		for(int i=0;i<arr.length-1;i=i+2) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		return arr;
	}

}
