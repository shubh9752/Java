package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="shubham";
		
		Scanner s=new Scanner (System.in);
		char ch=s.next().charAt(0);
		System.out.println(search2(name,ch));
		System.out.println(Arrays.toString(name.toCharArray()));//to convert string into char array
		

	}
	static boolean search(String name,char ch) {
		if(name.length()==0) {
			return false;
		}
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==ch) {
				return true;
			}
		}
		return false;
	}
	//using enhanced for loop
	static boolean search2(String name,char ch) {
		if(name.length()==0) {
			return false;
		}
		for(char c:name.toCharArray()) {
			if(c==ch) {
				return true;
			}
		}
		return false;
	}

}
