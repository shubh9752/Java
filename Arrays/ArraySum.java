package Arrays;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,2,5,6};
		sum(arr);

	}
	static void sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=arr[i]+sum;
		}
	    System.out.println(sum);
	}

}
