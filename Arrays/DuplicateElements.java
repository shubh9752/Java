package Arrays;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,4,2,3,4,5,1,7,3,5};
		duplicate(arr);

	}
	static void duplicate(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && i!=j) {
					System.out.println(arr[i]);
				}
			}
			
		}
	}

}
