//Arithmatic operaters(Addition)
import java.util.Scanner;
class Addition {
	public static void main(String[] args){
		int num1,num2,sum;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.print("Enter the first Number = ");
		num1=sc.nextInt();
		System.out.print("Enter the second Number = ");
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("Sum of two numbers is = "+sum);

	}
}