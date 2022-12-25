package ArraysBinary;

public class BinarySearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,9,10,14,17,20,21,25,28,34};
		int result=binarySearch(arr, 25);
		System.out.println(result);

	}
	public static int binarySearch(int[] arr,int ele) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			//int mid=(start+end)/2;//it may be possible that your start+end exceed the range of int in java
			int mid=start+(end-start)/2;
			if(ele<arr[mid]) {
				end=mid-1;
			}else if(ele>arr[mid]) {
				start=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}



