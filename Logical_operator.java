package java_PritiMiss;

import java.util.Scanner;

//And(&&) OR(||) not(!) 
public class Logical_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		boolean res;
		System.out.println("Enter two numbers :");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		res = num1>num2 && num1!=num2;
		System.out.println( "Result: " +res);
		res = num1>num2 || num1!=num2;
		System.out.println("Result :"+res);
	}

}
