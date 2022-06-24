package java_PritiMiss;

import java.util.Scanner;

//arithmetic operator binary-( + - * % / )
public class Arithmetic_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2,add,sub,mul,div,mod;
		System.out.println("enter two number");
		num1= sc.nextInt();
		num2= sc.nextInt();
		add = num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=num1/num2;
		mod=num1%num2;
		
		System.out.println("addition : " +add);
		System.out.println("Substraction : " +sub);
		System.out.println("multiplication : " +mul);
		System.out.println("division : " +div);
		System.out.println("modulus: " +mod);
		

	}

}
