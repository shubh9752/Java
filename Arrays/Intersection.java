package Arrays;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {0,7,12,15,18};
		int[] arr2= {12,13,14,15,19,18};
		duplicates(arr1,arr2);
//		duplicates1(arr1,arr2); works only for sorted arrays

	}
	static void duplicates(int[] arr1,int[] arr2) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					arr2[j] = Integer.MIN_VALUE;
                    break;
				}
			}
		}
	}
	static void duplicates1(int[] arr1,int[] arr2) {
		int i=0;
		int j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				System.out.println(arr1[i]);
				i++;
				j++;
			}else if(arr1[i]>arr2[j]) {
				j++;
			}else {
				i++;
			}
		}
	}

}
