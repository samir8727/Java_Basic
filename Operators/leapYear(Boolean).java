//Leap year
import java.util.Scanner;
class leapYear{
	public static void main(String[] args){
		int year;
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.print("Enter a year to check leapYear = ");
		year=sc.nextInt();
		boolean leapYear=(year%4==0 && year%100!=0)||(year%400==0);
		System.out.println(leapYear);
		

	}

}