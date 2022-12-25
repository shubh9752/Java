package Arrays;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,3,6,4,54,23,75,14};
		search(arr,70);
		

	}
	static void search(int[] arr,int num) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				System.out.println(i);
				return;
			}
			
			
		}
		System.out.println(-1);
	}

}
