package java_PritiMiss;

import java.util.Scanner;

//relational operator (==, !=, >, <, >=, <=)
public class Relational_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("enter two numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		boolean res;
		res = num1==num2;
		System.out.println("Result:" +res);
		res = num1!=num2;
		System.out.println("Result:" +res);
		res = num1>num2;
		System.out.println("Result:" +res);
		res = num1<num2;
		System.out.println("Result:" +res);
		res = num1<=num2;
		System.out.println("Result:" +res);
		res = num1>=num2;
		System.out.println("Result:" +res);
		

	}

}
