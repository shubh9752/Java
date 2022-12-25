package Arrays;

public class EvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,434,268,2,-6912,482,40};
		System.out.println(findNumbers(arr));

	}
	static int findNumbers(int[] arr) {
		int count=0;
		for(int num:arr) {
			if(even(num)) {
				count++;
			}
		}
		return count;
	}
	//check whreather number conatain even digit
	static boolean even(int num) {
		int numdigits=digits1(num);
		return numdigits%2==0;
	}
	//count number of degits in number
	static int digits(int num) {
		if(num<0) {
			num=num*-1;
		}
		if(num==0) {
			return 1;
		}
		int count=0;
		
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	}
	static int digits1(int num) {
		if(num<0) {
			num=num*-1;
		}
		if(num==0) {
			return 1;
		}
		return(int)(Math.log10(num))+1;
	}

}
