package java_PritiMiss;

import java.util.Scanner;

//ternary operator defines by a question mark
//wap to display a number whether it is even or add 
public class Ternary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, res;
		System.out.println("enter a number");
		num = sc.nextInt();
		res = (num%2==0)?num*num : num*num*num;
		System.out.println("Result : " +res );
		
		
		

	}

}
