package Arrays;

public class MaxElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,75,34,27,05,97,23};
		
		int l=max(arr);
		System.out.println(l+" is max element");
		int min_element=min(arr);
		System.out.println(min_element+" min element");
		int maxrange=maxRange(arr,1,6);
		System.out.println(maxrange);

	}
	static int max(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		return max;
	}
	static int min(int[] arr) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		return min;
	}
	static int maxRange(int[] arr,int start,int end) {
		int max=arr[start];
		for(int i=start;i<=end;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
