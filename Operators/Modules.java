//Arithmatic Operator(Modules)
import java.util.Scanner;
class Modules{
	public static void main(String[] sameer){
		int num1,num2,sub;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.print("Enter First Number = ");
		num1=sc.nextInt();
		System.out.print("Enter Second Number = ");
		num2=sc.nextInt();
		sub=num1%num2;

		System.out.println("Modules value is = "+sub);


	}
}