package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapIndexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr_size=s.nextInt();
		System.out.println();
		int[] arr=new int[arr_size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		swap(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	public static void swap(int[] arr,int index1,int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
		
	}

}
