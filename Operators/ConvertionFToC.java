//Java program for convert fahrenheat to  celsius.
import java.util.Scanner;
class Converation_F_To_C{
	public static void main (String[] args){
		double fahrenheat,celsius;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.print("Enter the temp fahrenheat to convert celsius = ");
		fahrenheat=sc.nextDouble();
		celsius=(5/9)*fahrenheat-32;
		System.out.println(celsius +"c");
	}
}