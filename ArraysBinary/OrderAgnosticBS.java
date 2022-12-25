package ArraysBinary;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,23,25,26,29,30,32,37,39,40};
		int[] arr2= {35,32,29,25,24,19,11,8,4,1};
		int target=27;
		int result=orderAgnosticBS(arr, target);
		System.out.println(result);

	}
	public static int orderAgnosticBS(int[] arr,int ele) {
		int start=0;
		int end=arr.length-1;
		//find arr is ascending or descending
		boolean isAsc=arr[start]<arr[end];


		while(start<=end) {
			int mid=start+(end-start)/2;
			if(ele==arr[mid]) {
				return mid;
			}
			if(isAsc) {
				if(ele>arr[mid]) {
					start=mid+1;
				}else {
					end=mid-1;
				}
			}else {
				if(ele>arr[mid]) {
					end=mid-1;
				}else{
					start=mid+1;
				}
			}

		}
		return end;
	}

}
