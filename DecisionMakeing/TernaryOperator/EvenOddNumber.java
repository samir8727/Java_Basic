//Find a number is an Even or Odd with the help of ternary Operator.
import java.util.Scanner;
class EvenOddNumber{
	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.print("Enter a number to know \"Even\" or \"Odd\" - ");
		int number=sc.nextInt();
		System.out.println(number%2==0?"Even":"Odd");
	}
}