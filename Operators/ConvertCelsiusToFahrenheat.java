//Java program for convert celsius to fahrenheat.
import java.util.Scanner;
class Converation_C_To_F{
	public static void main (String[] args){
		double fahrenheat,celsius;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.print("Enter the temp fahrenheat to convert celsius = ");
		celsius=sc.nextDouble();
		fahrenheat=(9/5)*celsius+32;
		System.out.println(fahrenheat +"F");
	}
}