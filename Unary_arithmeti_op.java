import java.util.Scanner;

public class Unary_arithmeti_op {
//unary ( ++, --) only one operand is called unary op
//pre increment (++a) post increment (a++)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,res;
		System.out.println("Enter a number");
		num = sc.nextInt();
		//num2= sc.nextInt();
		res = num++; //post increment
		System.out.println("Result :" +res);
		res = num--;
		System.out.println("Result :" +res);
		res = ++num; //pre increment
		System.out.println("Result :" +res);
		res = --num;
		System.out.println("Result :" +res);

	}

}
