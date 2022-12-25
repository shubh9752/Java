package Arrays;

import java.util.Arrays;

public class Sort01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,0,1,0,0,1,0,1,1};
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}
	static int[] sort(int[] arr) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				c++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i<c) {
				arr[i]=0;
			}else {
				arr[i]=1;
			}
		}
		return arr;
	}

}
