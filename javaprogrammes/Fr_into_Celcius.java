package javaprogrammes;

import java.util.Scanner;

public class Fr_into_Celcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int  S ,E , W, C1 ;
	        Scanner s=new Scanner(System.in);
	        S=s.nextInt();
	        E=s.nextInt();
	        W=s.nextInt();
	        while(S<=E) {
	            C1=((5*(S-32))/9);
	            System.out.println(S+"\t"+C1);
	            S=S+W;
	        }

	}

}
