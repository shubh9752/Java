package Arrays;

public class PrintPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,4,6,23,53,6};
		printPair(arr);
		

	}
	static void printPair(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println(arr[i]+", "+arr[j]);
			}
		}
	}

}
