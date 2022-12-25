package Arrays;

public class FindUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,3,5,7,6,5,2,2};
	    findUnique(arr);

	}
	static void findUnique(int[]arr) {
		
		for(int i=0;i<arr.length;i++) { 
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					if(arr[i]==arr[j]) { 
						count++;
					}
				}	
			}
			
			if(count==0) {
				System.out.println(arr[i]);
			}
		}
	}
}
		
	    

