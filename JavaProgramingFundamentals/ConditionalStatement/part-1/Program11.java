import java.util.Scanner;
class Grade{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.print("Enter your result to know your grade");
		int result=sc.nextInt();
		char grade;
		if (result>=85){
			grade = 'E';
		}else if (result>=75){
			grade = 'A';
		}else if (result>=60){
			grade = 'B';
		}else if (result>=50){
			grade = 'C';
		}else if (result>=40){
			grade = 'D';
		}else{
			grade = 'F';
		}
		System.out.println("your grade is "+grade);
	}

}