//BooleanDatatype
import java.util.Scanner;
class Leapyear{
	public static void main (String[] args){
		Scanner sc;
		sc= new Scanner(System.in);
		System.out.print("Enter a year to know leep or not - ");
		int year =sc.nextInt();
		boolean isLeapyear=(year%4==0 && year%100==0)||(year%400==0);
		System.out.println(isLeapyear);
	}
}