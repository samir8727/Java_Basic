//Switch case Statement
import java.util.Scanner;
class GradeClassiFication{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.print("Enter your score to know your grade - ");
		int score = sc.nextInt();
		char grade='X';
		

		 if (score>=80 && score<=100){
			grade='A';
		}else if (score>=60 && score<80){
			grade='B';
		
		}else if (score>=50 && score<60){
			grade='C';
		
		}else if (score>=35 && score<50){
			grade='D';
		
		}else if (score<=35){
			grade='F';
		}else{
			System.out.println("Enter number in between 100");
		}

		switch (grade){
			case 'A':
				System.out.println("you got Disticnation");
				break;
			case 'B':
				System.out.println("you got First Division");
				break;
			case 'C':
				System.out.println("you got second Division");
				break;
			case 'D':
				System.out.println("you got third Division");
				break;
			case 'F':
				System.out.println("Good luck for next time");
				break;
			default:
				System.out.println("Please enter the value in between 100");
		}


		
	}
}