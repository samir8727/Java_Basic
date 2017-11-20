//find Weak Days on help of Switch case ..
import java.util.Scanner;
class Weekdays{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner (System.in);
		System.out.print ("Enter the \"day\" number - ");
		int dayNumber = sc.nextInt();
		String day = "";

		switch (dayNumber){
			case 1 :
				day = "Monday";
			break;
			case 2:
				day = "Tuesday";
			break;
			case 3:
				day = "Wednesday";
			break;
			case 4:
				day = "Thursday";
			break;
			case 5:
				day = "Friday";
			break;
			case 6:
				day = "Saturday";
			break;
			case 7:
				day = "Sunday";
			break;

			default:
				System.out.println("please Enter the number between 1 to 7");

		}
		System.out.println(day);
		
	}
}