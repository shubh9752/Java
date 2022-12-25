package javaprogrammes;

import java.util.Scanner;

public class Total_Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int basic_salary=s.nextInt();
		char grade=s.next().charAt(0);
		
		double hra=(basic_salary*0.2);
		
		double da=(basic_salary*0.5);
		
		double pf=(basic_salary*0.11);
		
		double t_Salary=(basic_salary+hra+da-pf);
		
		if(grade =='A' ) {
			System.out.println(t_Salary+1700);
		}else if(grade =='B') {
			System.out.println(grade+" b  "+t_Salary+1500);
		}else {
			System.out.println(grade+" c "+t_Salary+1300);
		}
		
		

	}

}
