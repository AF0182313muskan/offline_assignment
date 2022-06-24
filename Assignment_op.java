package java_PritiMiss;
//assignment (=, +=. -=, *=,/=, %=)
import java.util.Scanner;

public class Assignment_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter two numbers");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num1=num2;
		System.out.println("Number is :" +num1);
		num1+=num2;
		System.out.println("Number is :" +num1);
		num1-=num2;
		System.out.println("Number is :" +num1);
		num1*=num2;
		System.out.println("Number is :" +num1);
		num1/=num2;
		System.out.println("Number is :" +num1);
		num1%=num2;
		System.out.println("Number is :" +num1);

	}

}
