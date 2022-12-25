package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DefiningOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=inputArray();
		System.out.println(Arrays.toString(arr));
		printArray(arr);



	}
		static int[] inputArray() {
			Scanner s=new Scanner(System.in);
			int arr_size=s.nextInt();
			System.out.println();
			int[] arr=new int[arr_size];
			for(int i=0;i<arr.length;i++) {
				arr[i]=s.nextInt();
			}
			return arr;
		}
		static void printArray(int[] arr) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("method to for printing");
			for(int i:arr) {
				System.out.print(i+" ");//here num represents elements of arr
			}

		}
	

}
